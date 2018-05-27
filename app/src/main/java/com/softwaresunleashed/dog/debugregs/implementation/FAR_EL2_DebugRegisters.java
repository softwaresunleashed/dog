package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class FAR_EL2_DebugRegisters extends DebugRegisters {

    private String regName = "FAR_EL2";

    private String regDesc = "";

    public FAR_EL2_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

}
