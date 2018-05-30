package com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class SP_DebugRegisters extends DebugRegisters {

    private String regName = "SP";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"SP\" />" +
            "        <FUNCTION VAL=\"Stack Pointer points to current address in Stack in current exception level.\" />" +
            "</BIT_FIELD>";

    public SP_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
