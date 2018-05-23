package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPSR_DebugRegisters extends DebugRegisters {

    private String regName = "CPSR";

    private String regDesc = "[31]\tN\t\n" +
            "Overflow flag:\n" +
            "\n" +
            "1 = overflow in last operation\n" +
            "\n" +
            "0 = no overflow.\n" +
            "\n" +
            "[30]\tZ\t\n" +
            "Zero flag:\n" +
            "\n" +
            "1 = result of 0 in last operation\n" +
            "\n" +
            "0 = nonzero result.\n" +
            "\n" +
            "[29]\tC\t\n" +
            "Carry/borrow flag:\n" +
            "\n" +
            "1 = carry or borrow in last operation\n" +
            "\n" +
            "0 = no carry or borrow.\n" +
            "\n" +
            "[28]\tV\t\n" +
            "Negative or less than flag:\n" +
            "\n" +
            "1 = result negative or less than in last operation\n" +
            "\n" +
            "0 = result positive or greater than.\n" +
            "\n" +
            "[27:8]\t-\tReserved\n" +
            "[7]\tI\t\n" +
            "IRQ disable bit:\n" +
            "\n" +
            "1 = IRQ interrupts disabled\n" +
            "\n" +
            "0 = IRQ interrupts enabled.\n" +
            "\n" +
            "[6]\tF\t\n" +
            "FIQ disable bit:\n" +
            "\n" +
            "1 = FIQ interrupts disabled\n" +
            "\n" +
            "0 = FIQ interrupts enabled.\n" +
            "\n" +
            "[5]\tT\t\n" +
            "Thumb state flag:\n" +
            "\n" +
            "1 = processor operating in Thumb state\n" +
            "\n" +
            "0 = processor operating in ARM state.\n" +
            "\n" +
            "[4:0]\tM\t\n" +
            "Mode field:\n" +
            "\n" +
            "b10000 = User mode\n" +
            "\n" +
            "b10001 = FIQ mode\n" +
            "\n" +
            "b10010 = IRQ mode\n" +
            "\n" +
            "b10011 = Supervisor mode\n" +
            "\n" +
            "b10111 = Abort mode\n" +
            "\n" +
            "b11011 = Undefined mode\n" +
            "\n" +
            "b11111 = System mode.";

    public CPSR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }

    @Override
    public String populate_description_view(String value) {
        String display = regName + " : " + value + "\n" + getRegister_description();
        return display;
    }

    @Override
    public String populate_regname_view() {
        return getRegister_name();
    }
}
