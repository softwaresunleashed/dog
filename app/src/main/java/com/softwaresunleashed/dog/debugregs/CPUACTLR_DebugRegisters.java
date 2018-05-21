package com.softwaresunleashed.dog.debugregs;

public class CPUACTLR_DebugRegisters extends DebugRegisters {

    private String regName = "CPUACTLR";

    private String regDesc = "";

    public CPUACTLR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

    @Override
    public String populate_description_view(String value) {
        String display = regName + " : " + value + "\n" + getRegister_description();
        return display;
    }

    @Override
    public String populate_regname_view() {
        return getRegister_name();
    }
}
