package com.softwaresunleashed.dog.activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aditya.filebrowser.Constants;
import com.aditya.filebrowser.FileChooser;
import com.softwaresunleashed.dog.Preferences;
import com.softwaresunleashed.dog.R;
import com.softwaresunleashed.dog.database.DatabaseHelper;
import com.softwaresunleashed.dog.database.TableDefinitions;
import com.softwaresunleashed.dog.debugregs.ESR_DebugRegisters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    EditText et_register_val;
    TextView tv_description;
    Cursor c = null;
    int RC_FILE_OPEN_DIALOG = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_description = (TextView) findViewById(R.id.tv_description);
        et_register_val = (EditText) findViewById(R.id.et_register_val);


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
                fetchRegisterDetailsFromAddress(et_register_val.getText().toString());
            }
        });


        ((Button) findViewById(R.id.btnOpenDump)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), FileChooser.class);
                i2.putExtra(Constants.SELECTION_MODE,Constants.SELECTION_MODES.SINGLE_SELECTION.ordinal());
                i2.putExtra(Constants.ALLOWED_FILE_EXTENSIONS, "txt");
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
        try {
            File file = new File(absolutePath);
            FileInputStream inputStream = new FileInputStream(file);


            if (inputStream != null) {
                InputStreamReader streamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(streamReader);

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

    private void parse_each_line(String line) {
        String split_array[]= line.split(",", 2);
        String register_address = split_array[0];
        String register_value = split_array[1];

        fetchRegisterDetailsFromAddress(register_address);
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

    private void process_value(CharSequence s) {
        Long bit_pattern = HexToLong(s.toString());
        tv_description.setText(tv_description.getText().toString()
                        + new ESR_DebugRegisters().populate_description_view(bit_pattern.toString()));

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

    private void fetchRegisterDetailsFromAddress(String regAddress){
        if(regAddress.isEmpty())
            return;

        if(regAddress.startsWith("0x"))
            regAddress = regAddress.substring(2);       // Skipping "0x" of the hexadecimal address

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
        Toast.makeText(MainActivity.this, "Successfully Imported", Toast.LENGTH_SHORT).show();

        // Apply where clause
        String whereClause = "" + TableDefinitions.REGISTERS_LOCATION_STR + "=?";
        String[] whereArgs = new String[] {
                lngRegAddress.toString()
        };

        // Get Detail ID of the Register
        c = myDbHelper.query(DatabaseHelper.DB_TABLE_REGISTERS, null, whereClause, whereArgs, null, null, null);
        String displayText = "";
        tv_description.setText(displayText);
        if(c.getCount() == 0){
            displayText = "Undefined / UnMapped Register Address";
        }
        else if (c.moveToFirst()) {
            do {

                displayText += tv_description.getText().toString() + "\n";

                // Print Register Name
                displayText += "RegName : " + c.getString(TableDefinitions.REGISTERS_NAME) + "\n";

                // Print Register Detail ID
                String detailId =  c.getString(TableDefinitions.REGISTERS_DETAILID);
                displayText += "RegDetailId : " + detailId + "\n";


                // Get Description of each Register
                // Apply where clause
                String whereClause_regdetail = "" + TableDefinitions.REGDETAILS_DETAILID_STR + "=?";
                String[] whereArgs_regdetail = new String[] {
                        detailId
                };
                Cursor c_desc = myDbHelper.query(DatabaseHelper.DB_TABLE_REGDETAILS, null, whereClause_regdetail, whereArgs_regdetail, null, null, null);
                if (c_desc.moveToFirst()) {
                    do {
                        displayText += c_desc.getString(TableDefinitions.REGDETAILS_BITRANGE) + " : " + c_desc.getString(TableDefinitions.REGDETAILS_DESCRIPTION) + "\n";
                    } while (c_desc.moveToNext());
                }
            } while (c.moveToNext());
        }

        tv_description.setText(displayText);

    }


}
