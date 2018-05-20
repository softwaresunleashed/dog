package com.softwaresunleashed.dog.debugregs;

public class ESR_EL3_DebugRegisters implements DebugRegisters {

    public ESR_EL3_DebugRegisters() {
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL3 : " + value + "\n";
        return display;
    }
}
