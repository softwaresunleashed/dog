package com.softwaresunleashed.dog.debugregs;

public class CPSR_DebugRegisters implements DebugRegisters {

    public CPSR_DebugRegisters() {
    }

    @Override
    public String populate_description_view(String value) {
        String display = "CPSR : " + value + "\n";
        return display;
    }
}
