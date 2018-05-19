package com.softwaresunleashed.dog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.softwaresunleashed.dog.debugregs.ESR_DebugRegisters;

import java.math.BigInteger;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText et_register_val;
    TextView tv_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_description = (TextView) findViewById(R.id.tv_description);
        et_register_val = (EditText) findViewById(R.id.et_register_val);

        et_register_val.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().isEmpty()){
                    tv_description.setText("");
                    tv_description.setText("Description : ");
                    process_value(s);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void process_value(CharSequence s) {
        String bit_pattern = HexToBinary(s.toString());
        tv_description.setText(tv_description.getText().toString()
                        + new ESR_DebugRegisters().populate_description_view(bit_pattern));

    }

    private String HexToBinary(String Hex) {
        try{
            String bin =  new BigInteger(Hex, 16).toString(2);
            int inb = Integer.parseInt(bin);
            bin = String.format(Locale.getDefault(),"%08d", inb);
            return bin;

        }catch (Exception e){
            e.printStackTrace();
        }

        return Hex;
    }
}
