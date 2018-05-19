package com.softwaresunleashed.dog;

import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.softwaresunleashed.dog.debugregs.ESR_DebugRegisters;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;

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


        ((Button) findViewById(R.id.button01)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                c = myDbHelper.query(DatabaseHelper.DB_TABLE_NAME, null, null, null, null, null, null);
                if (c.moveToFirst()) {
                    do {

                        tv_description.setText(tv_description.getText().toString() + "_id: " + c.getString(0) + "\n" +
                                "DATE: " + c.getString(1) + "\n" +
                                "TIME: " + c.getString(2) + "\n" +
                                "HEIGHT:  " + c.getString(3) + "\n");


//                        Toast.makeText(MainActivity.this,
//                                "_id: " + c.getString(0) + "\n" +
//                                        "DATE: " + c.getString(1) + "\n" +
//                                        "TIME: " + c.getString(2) + "\n" +
//                                        "HEIGHT:  " + c.getString(3),
//                                Toast.LENGTH_LONG).show();
                    } while (c.moveToNext());
                }
            }
        });

        tv_description = (TextView) findViewById(R.id.tv_description);
        et_register_val = (EditText) findViewById(R.id.et_register_val);

        et_register_val.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!s.toString().isEmpty()){
                    tv_description.setText("");
                    tv_description.setText("Description : ");
                    process_value(s);
                }
            }
        });

    }

    private void process_value(CharSequence s) {
        Long bit_pattern = HexToBinary(s.toString());
        tv_description.setText(tv_description.getText().toString()
                        + new ESR_DebugRegisters().populate_description_view(bit_pattern.toString()));

    }

    private Long HexToBinary(String Hex) {
        Long lngHexVal = new Long(-1);
        try{
            lngHexVal = Long.parseLong(Hex, 16);


            return lngHexVal;

        }catch (Exception e){
            e.printStackTrace();
        }

        return lngHexVal;
    }
}
