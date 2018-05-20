package com.softwaresunleashed.dog.debugregs;

public class ESR_EL2_DebugRegisters extends DebugRegisters {

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
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL2 : " + value + "\n" + getRegister_description();
        return display;
    }
}
