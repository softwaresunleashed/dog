package com.softwaresunleashed.dog;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.softwaresunleashed.dog.Settings.SettingsActivity;
import com.softwaresunleashed.dog.debugregs.ESR_DebugRegisters;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText et_register_val;
    TextView tv_description;
    Cursor c = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_description = (TextView) findViewById(R.id.tv_description);
        et_register_val = (EditText) findViewById(R.id.et_register_val);


        ((Button) findViewById(R.id.btnSelectNPI)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.btnDescribeMe)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchRegisterDetailsFromAddress(et_register_val.getText().toString());
            }
        });




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
