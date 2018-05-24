package com.softwaresunleashed.dog.debugregs.base_classes;

import java.util.ArrayList;

public class RegBitField {
    public int start_bit;
    public int end_bit;
    public String field_name;
    public String field_function;
    public ArrayList<ValidValues> validValuesArrayList;



    public RegBitField() {
        validValuesArrayList = new ArrayList<ValidValues>();
    }


}
