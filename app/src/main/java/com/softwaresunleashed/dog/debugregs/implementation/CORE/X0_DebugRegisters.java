package com.softwaresunleashed.dog.debugregs.implementation.CORE;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class X0_DebugRegisters extends DebugRegisters {

    private String regName = "X0";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"X0\" />" +
            "        <FUNCTION VAL=\"ARM CORE Register\" />" +
            "</BIT_FIELD>";

    public X0_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
