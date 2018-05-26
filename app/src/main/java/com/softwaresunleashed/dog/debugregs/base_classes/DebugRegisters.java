package com.softwaresunleashed.dog.debugregs.base_classes;

import java.util.ArrayList;

public abstract class DebugRegisters {


    private String register_name;
    private String register_description;
    private String register_value;
    private String register_address;
    private ArrayList<RegBitField> parsedDescription;


    public String populate_description_view(String register_address, String value) {
        // Set Register Address
        setRegister_address(register_address);

        // Set Register Value
        setRegister_value(value);

        // Parse Description
        setParsedDescription(DebugRegisterDescriptionParser.parseDescription(getRegister_description(), value));

        String display = "Description : " + "\n" + getRegister_description();
        return display;
    }


    public String populate_regname_view() {
        return getRegister_name();
    }



    public String getRegister_description() {
        return register_description;
    }

    public void setRegister_description(String register_description) {
        this.register_description = register_description;
    }



    public String getRegister_name() {
        return register_name;
    }

    public void setRegister_name(String register_name) {
        this.register_name = register_name;
    }




    public String getRegister_value() {
        return register_value;
    }

    public void setRegister_value(String register_value) {
        this.register_value = "0x800003cd";
//        this.register_value = register_value;
    }




    public String getRegister_address() {
        return register_address;
    }

    public void setRegister_address(String register_address) {
        this.register_address = register_address;
    }

    public ArrayList<RegBitField> getParsedDescription() {
        return parsedDescription;
    }

    public void setParsedDescription(ArrayList<RegBitField> parsedDescription) {
        this.parsedDescription = parsedDescription;
    }


}
