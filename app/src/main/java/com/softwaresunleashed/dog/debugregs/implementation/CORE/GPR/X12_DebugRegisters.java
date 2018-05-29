package com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class X12_DebugRegisters extends DebugRegisters {

    private String regName = "X12";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"X12\" />" +
            "        <FUNCTION VAL=\"ARM CORE GPR (64-bit)\" />" +
            "</BIT_FIELD>";

    public X12_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
