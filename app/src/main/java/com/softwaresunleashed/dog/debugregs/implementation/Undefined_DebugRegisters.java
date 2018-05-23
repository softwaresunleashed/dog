package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class Undefined_DebugRegisters extends DebugRegisters {

    private String regName = "Undefined";

    private String regDesc = "Undefined / UnMapped Register Address";

    public Undefined_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
