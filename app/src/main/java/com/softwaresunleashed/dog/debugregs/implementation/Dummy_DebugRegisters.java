package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class Dummy_DebugRegisters extends DebugRegisters {

    private String regName = "Dummy";

    private String regDesc = "Implementation Pending.";

    public Dummy_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
