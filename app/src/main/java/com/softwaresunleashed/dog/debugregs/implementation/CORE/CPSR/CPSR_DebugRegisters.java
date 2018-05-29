package com.softwaresunleashed.dog.debugregs.implementation.CORE.CPSR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPSR_DebugRegisters extends DebugRegisters {

    private String regName = "CPSR";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"31\" />" +
            "        <END_BIT VAL=\"31\"  />" +
            "        <NAME VAL=\"N\" />" +
            "        <FUNCTION VAL=\"Overflow flag\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"no overflow.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"overflow in last operation\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"30\" />" +
            "        <END_BIT VAL=\"30\"  />" +
            "        <NAME VAL=\"Z\" />" +
            "        <FUNCTION VAL=\"Zero flag\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"nonzero result.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"result of 0 in last operation\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"29\" />" +
            "        <END_BIT VAL=\"29\"  />" +
            "        <NAME VAL=\"C\" />" +
            "        <FUNCTION VAL=\"Carry/borrow flag\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"no carry or borrow.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"carry or borrow in last operation\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"28\" />" +
            "        <END_BIT VAL=\"28\"  />" +
            "        <NAME VAL=\"V\" />" +
            "        <FUNCTION VAL=\"Negative or less than flag\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"result negative or less than in last operation\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"result positive or greater than\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"27\" />" +
            "        <END_BIT VAL=\"27\"  />" +
            "        <NAME VAL=\"Q\" />" +
            "        <FUNCTION VAL=\"Cumulative saturation (sticky) flag\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"8\" />" +
            "        <END_BIT VAL=\"26\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"7\" />" +
            "        <END_BIT VAL=\"7\"  />" +
            "        <NAME VAL=\"I\" />" +
            "        <FUNCTION VAL=\"IRQ disable bit\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"IRQ interrupts disabled\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"IRQ interrupts enabled.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"6\" />" +
            "        <END_BIT VAL=\"6\"  />" +
            "        <NAME VAL=\"F\" />" +
            "        <FUNCTION VAL=\"FIQ disable bit\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"FIQ interrupts disabled\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"FIQ interrupts enabled.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"5\" />" +
            "        <END_BIT VAL=\"5\"  />" +
            "        <NAME VAL=\"T\" />" +
            "        <FUNCTION VAL=\"Thumb state flag\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"processor operating in Thumb state\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"processor operating in ARM state\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"4\" />" +
            "        <END_BIT VAL=\"4\"  />" +
            "        <NAME VAL=\"M\" />" +
            "        <FUNCTION VAL=\"Execution state\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"AArch32\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"AArch64\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"3\"  />" +
            "        <NAME VAL=\"M\" />" +
            "        <FUNCTION VAL=\"Mode field\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"User mode\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"FIQ mode\" />" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"IRQ mode\" />" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"Supervisor mode\" />" +
            "        <VALID_VALUE VAL=\"7\" VAL_MEANING=\"Abort mode\" />" +
            "        <VALID_VALUE VAL=\"11\" VAL_MEANING=\"Undefined mode\" />" +
            "        <VALID_VALUE VAL=\"15\" VAL_MEANING=\"System mode\" />" +
            "</BIT_FIELD>";

    public CPSR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
