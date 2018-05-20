package com.softwaresunleashed.dog.debugregs;

import android.view.View;

public class ESR_EL1_DebugRegisters implements DebugRegisters {

    public ESR_EL1_DebugRegisters() {
    }

    @Override
    public String populate_description_view(String value) {
        String display = "ESR_EL1 : " + value + "\n";
        return display;
    }
}
