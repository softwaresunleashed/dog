package com.softwaresunleashed.dog.debugregs;

import android.view.View;

public class ESR_DebugRegisters implements DebugRegisters {

    public ESR_DebugRegisters() {
    }

    @Override
    public String populate_description_view(String value) {
            return value;
    }
}
