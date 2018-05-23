package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPUECTLR_DebugRegisters extends DebugRegisters {

    private String regName = "CPUECTLR";

    private String regDesc = "";

    public CPUECTLR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

}
