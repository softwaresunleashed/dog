package com.softwaresunleashed.dog.debugregs.base_classes;

public abstract class DebugRegisters {


    private String register_name;
    private String register_description;
    private String register_value;
    private String register_address;

    public String populate_description_view(String register_address, String value) {
        setRegister_address(register_address);
        setRegister_value(value);
//        String display = getRegister_name() + " : " + value + "\n" + getRegister_description();
        String display = "Description : " + "\n" + getRegister_description();
        return display;
    }

    public String populate_regname_view() {
        return getRegister_name();
    }

    public String populate_regaddr_view() {
        return getRegister_address();
    }

    public String populate_regvalue_view() {
        return getRegister_value();
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
        this.register_value = register_value;
    }




    public String getRegister_address() {
        return register_address;
    }

    public void setRegister_address(String register_address) {
        this.register_address = register_address;
    }


}
