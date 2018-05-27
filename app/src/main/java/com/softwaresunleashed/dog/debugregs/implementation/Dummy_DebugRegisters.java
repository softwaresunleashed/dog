package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class Dummy_DebugRegisters extends DebugRegisters {

    private String regName = "Undefined";

    private String regDesc = "Undefined / UnMapped Register Address";

    public Dummy_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
