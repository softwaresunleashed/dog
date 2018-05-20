package com.softwaresunleashed.dog.debugregs;

public class ESR_EL3_DebugRegisters extends DebugRegisters {

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
            "This field is 1 for the SError interrupt, instruction aborts, misaligned PC, Stack pointer misalignment, data aborts for which the ISV bit is 0, exceptions caused by an illegal instruction set state, and exceptions using the 0x0 Exception Class.\n" +
            "\n" +
            "[24]\tISS Valid\t\n" +
            "Syndrome valid. The possible values are:\n" +
            "\n" +
            "0\n" +
            "ISS not valid, ISS is res0.\n" +
            "\n" +
            "1\n" +
            "ISS valid.\n" +
            "\n" +
            "[23:0]\tISS\t\n" +
            "Syndrome information.";

    public ESR_EL3_DebugRegisters() {
        setRegister_description(regDesc);
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL3 : " + value + "\n" + getRegister_description();
        return display;
    }
}
