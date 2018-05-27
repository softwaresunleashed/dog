package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class FAR_EL2_DebugRegisters extends DebugRegisters {

    private String regName = "FAR_EL2";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"FAR_EL2\" />" +
            "        <FUNCTION VAL=\"Faulting Virtual Address for synchronous exceptions taken to EL2. Exceptions that set the FAR_EL2 are Instruction Aborts (EC 0x20 or 0x21), Data Aborts (EC 0x24 or 0x25), PC alignment faults (EC 0x22), and Watchpoints (EC 0x34 or 0x35). ESR_EL2.EC holds the EC value for the exception.\" />        " +
            "</BIT_FIELD>";

    public FAR_EL2_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

}
