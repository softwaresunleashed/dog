package com.softwaresunleashed.dog.debugregs;

public abstract class DebugRegisters {


    String register_description;

    public String getRegister_description() {
        return register_description;
    }

    public void setRegister_description(String register_description) {
        this.register_description = register_description;
    }

    abstract public String populate_description_view(String value);
}
