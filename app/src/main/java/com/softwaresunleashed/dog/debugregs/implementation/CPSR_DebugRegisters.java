package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPSR_DebugRegisters extends DebugRegisters {

    private String regName = "CPSR";

    private String regDesc = "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"31\" />\n" +
            "        <END_BIT VAL=\"31\"  />\n" +
            "        <NAME VAL=\"N\" />\n" +
            "        <FUNCTION VAL=\"Overflow flag\" />\n" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"no overflow.\" />\n" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"overflow in last operation\" />\n" +
            "</BIT_FIELD>\n" +
            "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"30\" />\n" +
            "        <END_BIT VAL=\"30\"  />\n" +
            "        <NAME VAL=\"Z\" />\n" +
            "        <FUNCTION VAL=\"Zero flag\" />\n" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"nonzero result.\" />\n" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"result of 0 in last operation\" />\n" +
            "</BIT_FIELD>\n" +
            "<BIT_FIELD>\n" +
            "        <START_BIT VAL=\"29\" />\n" +
            "        <END_BIT VAL=\"29\"  />\n" +
            "        <NAME VAL=\"C\" />\n" +
            "        <FUNCTION VAL=\"Carry/borrow flag\" />\n" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"no carry or borrow.\" />\n" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"carry or borrow in last operation\" />\n" +
            "</BIT_FIELD>";

    public CPSR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
