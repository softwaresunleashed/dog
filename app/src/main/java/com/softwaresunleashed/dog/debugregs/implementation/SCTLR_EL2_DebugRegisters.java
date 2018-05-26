package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class SCTLR_EL2_DebugRegisters extends DebugRegisters {

    private String regName = "SCTLR_EL2";

    private String regDesc = "";

    public SCTLR_EL2_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
