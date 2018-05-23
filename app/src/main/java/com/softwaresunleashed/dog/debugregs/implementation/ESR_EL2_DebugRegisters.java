package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class ESR_EL2_DebugRegisters extends DebugRegisters {

    private String regName = "ESR_EL2";

    private String regDesc = "[31:26]\tEC\tException Class. Indicates the reason for the exception that this register holds information about.\n" +
            "[25]\tIL\t\n" +
            "Instruction Length for synchronous exceptions. The possible values are:\n" +
            "\n" +
            "0\n" +
            "16-bit.\n" +
            "\n" +
            "1\n" +
            "32-bit.\n" +
            "\n" +
            "[24:0]\tISS\t\n" +
            "Syndrome information.";

    public ESR_EL2_DebugRegisters() {
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
