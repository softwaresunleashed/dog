package com.softwaresunleashed.dog.debugregs.implementation.FAR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class FAR_EL3_DebugRegisters extends DebugRegisters {

    private String regName = "FAR_EL3";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"FAR_EL3\" />" +
            "        <FUNCTION VAL=\"Faulting Virtual Address for synchronous exceptions taken to EL3. Exceptions that set the FAR_EL3 are Instruction Aborts (EC 0x20 or 0x21), Data Aborts (EC 0x24 or 0x25), and PC alignment faults (EC 0x22). ESR_EL3.EC holds the EC value for the exception\" />        " +
            "</BIT_FIELD>";

    public FAR_EL3_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

}
