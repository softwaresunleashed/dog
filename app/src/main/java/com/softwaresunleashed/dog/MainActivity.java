package com.softwaresunleashed.dog;

import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        ((Button) findViewById(R.id.button01)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchRegisterDetailsFromAddress(et_register_val.getText().toString());
            }
        });

        et_register_val = (EditText) findViewById(R.id.et_register_val);

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
        if (c.moveToFirst()) {
            do {
                tv_description.setText(tv_description.getText().toString() + c.getString(TableDefinitions.REGISTERS_DETAILID) + "\n");

//                //tv_description.setText(tv_description.getText().toString() + "_id: " + c.getString(0) + "\n" +
//                        "DATE: " + c.getString(1) + "\n" +
//                        "TIME: " + c.getString(2) + "\n" +
//                        "HEIGHT:  " + c.getString(3) + "\n");

            } while (c.moveToNext());
        }
    }


}
