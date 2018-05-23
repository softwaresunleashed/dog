package com.softwaresunleashed.dog.debugregs.base_classes;

public abstract class DebugRegisters {


    String register_name;
    String register_description;

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

    abstract public String populate_description_view(String value);
    abstract public String populate_regname_view();
}
