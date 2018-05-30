package com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class SP_EL2_DebugRegisters extends DebugRegisters {

    private String regName = "SP_EL2";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"SP_EL2\" />" +
            "        <FUNCTION VAL=\"Displays the value of SP in a particular Exception Level.\" />" +
            "</BIT_FIELD>";



    public SP_EL2_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
