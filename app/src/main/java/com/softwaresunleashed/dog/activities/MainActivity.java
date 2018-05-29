package com.softwaresunleashed.dog.activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aditya.filebrowser.Constants;
import com.aditya.filebrowser.FileChooser;
import com.softwaresunleashed.dog.debugregs.base_classes.RegBitField;
import com.softwaresunleashed.dog.debugregs.implementation.Dummy_DebugRegisters;
import com.softwaresunleashed.dog.recyclerview_regdescription.ExpandableRecyclerAdapter;
import com.softwaresunleashed.dog.utils.InputFileXMLParser;
import com.softwaresunleashed.dog.utils.Preferences;
import com.softwaresunleashed.dog.R;
import com.softwaresunleashed.dog.recyclerview_regdescription.RegisterDetailsHolder;
import com.softwaresunleashed.dog.database.DatabaseHelper;
import com.softwaresunleashed.dog.database.TableDefinitions;
import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;
import com.softwaresunleashed.dog.debugregs.base_classes.RegFacade;
import com.softwaresunleashed.dog.debugregs.implementation.Undefined_DebugRegisters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et_register_val;
    TextView tv_description;

    Cursor c = null;
    int RC_FILE_OPEN_DIALOG = 123;

    private RecyclerView recyclerView;
    private List<RegisterDetailsHolder> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("D.O.G.");
        ab.setSubtitle("Debug On Go");


        tv_description = (TextView) findViewById(R.id.tv_description);
        et_register_val = (EditText) findViewById(R.id.et_register_val);


        data = new ArrayList<RegisterDetailsHolder>();

        is_npi_db_set();

        ((Button) findViewById(R.id.btnSelectNPI)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop_up_npi_selection_activity();
            }
        });

        ((Button) findViewById(R.id.btnDescribeMe)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchRegisterDetailsFromAddress(et_register_val.getText().toString(), "0");
            }
        });


        ((Button) findViewById(R.id.btnOpenDump)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), FileChooser.class);
                i2.putExtra(Constants.SELECTION_MODE,Constants.SELECTION_MODES.SINGLE_SELECTION.ordinal());
                i2.putExtra(Constants.ALLOWED_FILE_EXTENSIONS, "txt;xml");
                startActivityForResult(i2,RC_FILE_OPEN_DIALOG);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RC_FILE_OPEN_DIALOG && resultCode==RESULT_OK) {
            Uri selectedfile = data.getData(); //The uri with the location of the file
            File fileFromUri = new File(selectedfile.getPath());
            Preferences.setCurrentDumpFile(getApplicationContext(), fileFromUri.getAbsolutePath());
            parse_dump_file(fileFromUri.getAbsolutePath());
        }
    }

    private void parse_dump_file(String absolutePath) {

        // Choose the parser depending on the file type
        if(absolutePath.contains(".txt"))
            parse_txt_file(absolutePath);

        if(absolutePath.contains(".xml"))
            parse_xml_file(absolutePath);

        // Finally populate recycler view.
        populate_recycler_view();

    }


    private void parse_txt_file(String absolutePath) {
        try {
            File file = new File(absolutePath);
            FileInputStream inputStream = new FileInputStream(file);


            if (inputStream != null) {
                InputStreamReader streamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(streamReader);

                // Clear register list before starting
                data.clear();

                String line;
                while (( line = bufferedReader.readLine()) != null) {
                    parse_each_line(line);
                }
            }
            inputStream.close(); //close the file
        } catch (java.io.FileNotFoundException e) {
            //file doesn't exist
            e.printStackTrace();
        } catch (java.io.IOException e) {
            //file IO exception
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    private void parse_xml_file(String absolutePath) {
        try {
            File file = new File(absolutePath);
            FileInputStream inputStream = new FileInputStream(file);

            if (inputStream != null) {

                // Clear register list before starting
                data.clear();

                ArrayList<String> lines = (new InputFileXMLParser()).parseXML(inputStream);
                for (String line: lines) {
                    parse_each_line(line);
                }


            }
            inputStream.close(); //close the file
        } catch (java.io.FileNotFoundException e) {
            //file doesn't exist
            e.printStackTrace();
        } catch (java.io.IOException e) {
            //file IO exception
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void parse_each_line(String line) {
        String split_array[]= line.split(",", 2);
        String register_address = split_array[0];
        String register_value = split_array[1];

        fetchRegisterDetailsFromAddress(register_address, register_value);
    }

    private void is_npi_db_set() {
        String current_npi_db = Preferences.getCurrentNPIDB(getApplicationContext());
        if(current_npi_db == null || current_npi_db.isEmpty()){
            // No DB Set, display NPI DB Selection Activity
            pop_up_npi_selection_activity();
        } else {
            // DB is set, set the global DB pointer to this current DB
            DatabaseHelper.DB_NAME = current_npi_db;
        }
    }

    private void pop_up_npi_selection_activity(){
        Intent intent = new Intent(MainActivity.this, NPISelelctionActivity.class);
        startActivity(intent);
    }

    private Long HexToLong(String Hex) {
        Long lngHexVal = new Long(-1);
        try{
            lngHexVal = Long.parseLong(Hex, 16);
            return lngHexVal;
        }catch (Exception e){
            e.printStackTrace();
        }
        return lngHexVal;
    }

    private void fetchRegisterDetailsFromAddress(String regAddress, String regValue){
        if(regAddress.isEmpty())
            return;

        if(regAddress.startsWith("0x"))
            regAddress = regAddress.substring(2);       // Skipping "0x" of the hexadecimal address
        else
            regAddress = getRegisterAddress(regAddress);     // Register is not a hex address but a name. Conversion required

        RegisterDetailsHolder registerDetailsHolder = new RegisterDetailsHolder();
        registerDetailsHolder.setRegisterValue("0x" + regAddress);

        // Convert Hex Value to Long
        Long lngRegAddress = HexToLong(regAddress);

        DatabaseHelper myDbHelper = new DatabaseHelper(MainActivity.this);
        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }
        try {
            myDbHelper.openDataBase();
        } catch (SQLException sqle) {
            throw sqle;
        }
        //Toast.makeText(MainActivity.this, "Successfully Imported", Toast.LENGTH_SHORT).show();

        // Apply where clause
        String whereClause = "" + TableDefinitions.REGISTERS_LOCATION_STR + "=?";
        String[] whereArgs = new String[] {
                lngRegAddress.toString()
        };

        // Get Detail ID of the Register
        c = myDbHelper.query(DatabaseHelper.DB_TABLE_REGISTERS, null, whereClause, whereArgs, null, null, null);
        String displayText = tv_description.getText().toString();
        //tv_description.setText(displayText);
        if(c.getCount() == 0){
            displayText += "Undefined / UnMapped Register Address : " + "0x" + regAddress + "\n";
            registerDetailsHolder.setRegisterName((new Undefined_DebugRegisters()).populate_regname_view());
        }
        else if (c.moveToFirst()) {
            do {
                //displayText += tv_description.getText().toString() + "\n";

                // Print Register Name
                String regName = c.getString(TableDefinitions.REGISTERS_NAME);
                displayText += "RegName : " + regName + "\n";

                // Print Register Detail ID
                String detailId = c.getString(TableDefinitions.REGISTERS_DETAILID);
                if (detailId == null || detailId.isEmpty()) {
                    // No Detail present. Go to Debug Register Implementation
                    DebugRegisters debugRegisters = RegFacade.getRegisterInstance(lngRegAddress.toString());
                    if(debugRegisters instanceof Dummy_DebugRegisters){
                        // Register doesn't have Detail in CW Database....and DebugRegister Implementation is pending in code.
                        // Hence fill in dummy register object with whatever information we have.
                        debugRegisters.setRegister_name(regName);
                    }

                    // Call respective register's populate description routine
                    displayText += debugRegisters.populate_description_view(regAddress, regValue);
                    registerDetailsHolder.setRegisterDescription(debugRegisters.populate_description_view(regAddress, regValue));
                    registerDetailsHolder.setRegisterName(debugRegisters.populate_regname_view());

                    registerDetailsHolder.setRegisterValue(debugRegisters.getRegister_value());
                    registerDetailsHolder.setRegisterAddress(debugRegisters.getRegister_address());
                    registerDetailsHolder.setRegisterBitField(debugRegisters.getParsedDescription());
                } else {
                    displayText += "RegDetailId : " + detailId + "\n";

                    // Get Description of each Register
                    // Apply where clause
                    String whereClause_regdetail = "" + TableDefinitions.BITFIELDS_DETAILID_STR + "=?";
                    String[] whereArgs_regdetail = new String[]{
                            detailId
                    };
                    Cursor c_desc = myDbHelper.query(DatabaseHelper.DB_TABLE_BITFIELDS, null, whereClause_regdetail, whereArgs_regdetail, null, null, null);
                    if (c_desc.moveToFirst()) {
                        ArrayList<RegBitField> regBitFieldArrayList = new ArrayList<RegBitField>();
                        do {

                            // Fill in each register info
                            registerDetailsHolder.setRegisterDescription(c_desc.getString(TableDefinitions.REGDETAILS_BITRANGE) + " : " + c_desc.getString(TableDefinitions.REGDETAILS_DESCRIPTION) + "\n");
                            registerDetailsHolder.setRegisterName(regName);
                            registerDetailsHolder.setRegisterValue(regValue);
                            registerDetailsHolder.setRegisterAddress(regAddress);

                            // Extract Bit Field Info from CW DB
                            String bit_range_from_db = c_desc.getString(TableDefinitions.BITFIELDS_BITRANGE);
                            String bitfield_desc_from_db = c_desc.getString(TableDefinitions.BITFIELDS_DESCRIPTION);
                            String bitfield_name_from_db = c_desc.getString(TableDefinitions.BITFIELDS_NAME);

                            RegBitField regBitField = new RegBitField();
                            String split_array[]= bit_range_from_db.split(":", 2);
                            regBitField.start_bit = Integer.parseInt(split_array[1]);
                            regBitField.end_bit = Integer.parseInt(split_array[0]);
                            regBitField.field_name = bitfield_name_from_db;
                            regBitField.field_function = bitfield_desc_from_db;
                            regBitFieldArrayList.add(regBitField);

                            displayText +=  bit_range_from_db + " : " + bitfield_desc_from_db + "\n";
                        } while (c_desc.moveToNext());
                        registerDetailsHolder.setRegisterBitField(regBitFieldArrayList);
                    }
                }
                data.add(registerDetailsHolder);
            } while (c.moveToNext());
        }
        //tv_description.setText(displayText);
    }

    private String getRegisterAddress(String regAddress) {

        DatabaseHelper myDbHelper = new DatabaseHelper(MainActivity.this);
        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }
        try {
            myDbHelper.openDataBase();
        } catch (SQLException sqle) {
            throw sqle;
        }

        // Apply where clause
        String whereClause = "" + TableDefinitions.REGISTERS_NAME_STR + "=?";
        String[] whereArgs = new String[]{
                regAddress
        };

        // Get Detail ID of the Register
        c = myDbHelper.query(DatabaseHelper.DB_TABLE_REGISTERS, null, whereClause, whereArgs, null, null, null);
        String regName = null;
        if (c.moveToFirst()) {
            do {
                // get Register location
                regName = c.getString(TableDefinitions.REGISTERS_LOCATION);
            }while (c.moveToNext());
        }

        // Convert to  Hex
        Long regNameAddressInLong = Long.parseLong(regName);
        regName = Long.toHexString(regNameAddressInLong);

        myDbHelper.close();

        return regName;
    }

    void populate_recycler_view(){
        
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view_register_description);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //fetch data and on ExpandableRecyclerAdapter
        recyclerView.setAdapter(new ExpandableRecyclerAdapter(data));
    }

}
