package com.softwaresunleashed.dog.debugregs.implementation.PSTATE;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CURRRENTEL_DebugRegisters extends DebugRegisters {

    private String regName = "CurrentEL";

    private String regDesc = "";

    public CURRRENTEL_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
