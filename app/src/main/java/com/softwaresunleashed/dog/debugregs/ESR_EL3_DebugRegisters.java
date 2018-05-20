package com.softwaresunleashed.dog.debugregs;

public class ESR_EL3_DebugRegisters extends DebugRegisters {

    private String regDesc = "";

    public ESR_EL3_DebugRegisters() {
        setRegister_description(regDesc);
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL3 : " + value + "\n" + getRegister_description();
        return display;
    }
}
