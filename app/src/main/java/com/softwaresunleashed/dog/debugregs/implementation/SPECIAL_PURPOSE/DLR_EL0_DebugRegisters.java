package com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class DLR_EL0_DebugRegisters extends DebugRegisters {

    private String regName = "DLR_EL0";

    private String regDesc = "";



    public DLR_EL0_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
