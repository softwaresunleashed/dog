package com.softwaresunleashed.dog.debugregs.implementation.CPUECTLR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPUECTLR_DebugRegisters extends DebugRegisters {

    private String regName = "CPUECTLR";

    private String regDesc = "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"63\" />\n" +
            "        <END_BIT VAL=\"7\"  />\n" +
            "        <NAME VAL=\"-\" />\n" +
            "        <FUNCTION VAL=\"Reserved\" />\n" +
            "</BIT_FIELD>\n" +
            "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"6\" />\n" +
            "        <END_BIT VAL=\"6\"  />\n" +
            "        <NAME VAL=\"SMPEN\" />\n" +
            "        <FUNCTION VAL=\"Enable hardware management of data coherency with other cores in the cluster\" />\n" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Enables data coherency with other cores in the cluster.\" />\n" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disables data coherency with other cores in the cluster. This is the reset value.\" />\n" +
            "</BIT_FIELD>\n" +
            "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"3\" />\n" +
            "        <END_BIT VAL=\"5\"  />\n" +
            "        <NAME VAL=\"FPRETCTL\" />\n" +
            "        <FUNCTION VAL=\"Advanced SIMD and Floating-point retention control\" />\n" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disable the retention circuit. This is the reset value.\" />\n" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"2 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"8 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"32 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"4\" VAL_MEANING=\"64 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"5\" VAL_MEANING=\"128 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"6\" VAL_MEANING=\"256 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"7\" VAL_MEANING=\"512 Architectural Timer ticks are required before retention entry.\" />\n" +
            "</BIT_FIELD>\n" +
            "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"0\" />\n" +
            "        <END_BIT VAL=\"2\"  />\n" +
            "        <NAME VAL=\"CPURETCTL\" />\n" +
            "        <FUNCTION VAL=\"CPU retention control\" />\n" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disable the retention circuit. This is the reset value.\" />\n" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"2 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"8 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"32 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"4\" VAL_MEANING=\"64 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"5\" VAL_MEANING=\"128 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"6\" VAL_MEANING=\"256 Architectural Timer ticks are required before retention entry.\" />\n" +
            "        <VALID_VALUE VAL=\"7\" VAL_MEANING=\"512 Architectural Timer ticks are required before retention entry.\" />\n" +
            "</BIT_FIELD>";

    public CPUECTLR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

}
