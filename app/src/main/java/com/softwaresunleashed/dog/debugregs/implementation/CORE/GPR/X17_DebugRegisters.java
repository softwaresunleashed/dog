package com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class X17_DebugRegisters extends DebugRegisters {

    private String regName = "X17";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"X17\" />" +
            "        <FUNCTION VAL=\"ARM CORE GPR (64-bit)\" />" +
            "</BIT_FIELD>";

    public X17_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
