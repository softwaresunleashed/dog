package com.softwaresunleashed.dog.debugregs;

public class ESR_EL2_DebugRegisters implements DebugRegisters {

    public ESR_EL2_DebugRegisters() {
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL2 : " + value + "\n";
        return display;
    }
}
