package com.softwaresunleashed.dog.debugregs;

public class CPSR_DebugRegisters extends DebugRegisters {

    private String regDesc = "";

    public CPSR_DebugRegisters() {
        setRegister_description(regDesc);
    }

    @Override
    public String populate_description_view(String value) {
        String display = "CPSR : " + value + "\n" + getRegister_description();
        return display;
    }
}
