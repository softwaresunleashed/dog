package com.softwaresunleashed.dog.debugregs;

public class ESR_EL1_DebugRegisters extends DebugRegisters {

    private String regDesc = "";

    public ESR_EL1_DebugRegisters() {
        setRegister_description(regDesc);
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL1 : " + value + "\n" + getRegister_description();
        return display;
    }
}
