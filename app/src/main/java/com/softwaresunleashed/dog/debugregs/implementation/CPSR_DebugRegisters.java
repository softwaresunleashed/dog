package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPSR_DebugRegisters extends DebugRegisters {

    private String regName = "CPSR";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"31\" />" +
            "        <END_BIT VAL=\"31\"  />" +
            "        <NAME VAL=\"N\" />" +
            "        <FUNCTION VAL=\"Overflow flag\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"no overflow.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"overflow in last operation\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"30\" />" +
            "        <END_BIT VAL=\"30\"  />" +
            "        <NAME VAL=\"Z\" />" +
            "        <FUNCTION VAL=\"Zero flag\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"nonzero result.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"result of 0 in last operation\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"29\" />" +
            "        <END_BIT VAL=\"29\"  />" +
            "        <NAME VAL=\"C\" />" +
            "        <FUNCTION VAL=\"Carry/borrow flag\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"no carry or borrow.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"carry or borrow in last operation\" />" +
            "</BIT_FIELD>";

    public CPSR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
