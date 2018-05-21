package com.softwaresunleashed.dog.debugregs;

public class Undefined_DebugRegisters extends DebugRegisters {

    private String regName = "Undefined";

    private String regDesc = "Undefined / UnMapped Register Address";

    public Undefined_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

    @Override
    public String populate_description_view(String value) {
        String display = "Undefined : " + value + "\n" + getRegister_description();
        return display;
    }

    @Override
    public String populate_regname_view() {
        return getRegister_name();
    }
}
