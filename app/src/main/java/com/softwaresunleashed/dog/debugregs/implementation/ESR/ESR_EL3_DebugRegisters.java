package com.softwaresunleashed.dog.debugregs.implementation.ESR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class ESR_EL3_DebugRegisters extends DebugRegisters {

    private String regName = "ESR_EL3";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"26\" />" +
            "        <END_BIT VAL=\"31\"  />" +
            "        <NAME VAL=\"EC\" />" +
            "        <FUNCTION VAL=\"Exception Class. Indicates the reason for the exception that this register holds information about.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Unknown reason. This value is valid for all described registers\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Trapped WFI or WFE instruction execution. Conditional WFE and WFI instructions that fail their condition code check do not cause an exception.\" />" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"Trapped MCR or MRC access with (coproc==1111) that is not reported using EC 0b000000.\" />" +
            "        <VALID_VALUE VAL=\"4\" VAL_MEANING=\"Trapped MCRR or MRRC access with (coproc==0b1111)b that is not reported using EC 0b000000\" />" +
            "        <VALID_VALUE VAL=\"5\" VAL_MEANING=\"Trapped MCR or MRC access with (coproc==0b1110)\" />" +
            "        <VALID_VALUE VAL=\"6\" VAL_MEANING=\"Trapped LDC or STC access\" />" +
            "        <VALID_VALUE VAL=\"7\" VAL_MEANING=\"Access to SVE, Advanced SIMD or floating-point functionality trapped by CPACR_EL1.FPEN or CPTR_ELx.TFP control\" />" +
            "        <VALID_VALUE VAL=\"9\" VAL_MEANING=\"Trapped access to an ARMv8.3-PAuth instruction\" />" +
            "        <VALID_VALUE VAL=\"12\" VAL_MEANING=\"Trapped MRRC access with (coproc==0b1110)\" />" +
            "        <VALID_VALUE VAL=\"14\" VAL_MEANING=\"Illegal Execution state\" />" +
            "        <VALID_VALUE VAL=\"19\" VAL_MEANING=\"SMC instruction execution in AArch32 state, when SMC is not disabled\" />" +
            "        <VALID_VALUE VAL=\"21\" VAL_MEANING=\"SVC instruction execution in AArch64 state\" />" +
            "        <VALID_VALUE VAL=\"22\" VAL_MEANING=\"HVC instruction execution in AArch64 state, when HVC is not disabled\" />" +
            "        <VALID_VALUE VAL=\"23\" VAL_MEANING=\"SMC instruction execution in AArch64 state, when SMC is not disabled\" />" +
            "        <VALID_VALUE VAL=\"24\" VAL_MEANING=\"Trapped MSR, MRS, or System instruction execution, that is not reported using EC 0x00, 0x01, or 0x07\" />" +
            "        <VALID_VALUE VAL=\"25\" VAL_MEANING=\"Trapped access to SVE functionality, that is not reported using EC 0b000000\" />" +
            "        <VALID_VALUE VAL=\"31\" VAL_MEANING=\"IMPLEMENTATION DEFINED exception taken to EL3\" />" +
            "        <VALID_VALUE VAL=\"32\" VAL_MEANING=\"Instruction Abort from a lower Exception level\" />" +
            "        <VALID_VALUE VAL=\"33\" VAL_MEANING=\"Instruction Abort taken without a change in Exception level\" />" +
            "        <VALID_VALUE VAL=\"34\" VAL_MEANING=\"PC alignment fault\" />" +
            "        <VALID_VALUE VAL=\"36\" VAL_MEANING=\"Data Abort from a lower Exception level\" />" +
            "        <VALID_VALUE VAL=\"37\" VAL_MEANING=\"Data Abort taken without a change in Exception level\" />" +
            "        <VALID_VALUE VAL=\"38\" VAL_MEANING=\"SP alignment fault\" />" +
            "        <VALID_VALUE VAL=\"44\" VAL_MEANING=\"Trapped floating-point exception taken from AArch64 state\" />" +
            "        <VALID_VALUE VAL=\"47\" VAL_MEANING=\"SError interrupt\" />" +
            "        <VALID_VALUE VAL=\"60\" VAL_MEANING=\" BRK instruction execution in AArch64 state\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"25\" />" +
            "        <END_BIT VAL=\"25\"  />" +
            "        <NAME VAL=\"IL\" />" +
            "        <FUNCTION VAL=\"Instruction Length for synchronous exceptions\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"16-bit\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"32-bit. This field is 1 for the SError interrupt, instruction aborts, misaligned PC, Stack pointer misalignment, data aborts for which the ISV bit is 0, exceptions caused by an illegal instruction set state, and exceptions using the 0x00 Exception Class.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"24\" />" +
            "        <END_BIT VAL=\"24\"  />" +
            "        <NAME VAL=\"ISS Valid\" />" +
            "        <FUNCTION VAL=\"Syndrome valid\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"ISS not valid, ISS is res0.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"ISS is valid\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"23\"  />" +
            "        <NAME VAL=\"ISS\" />" +
            "        <FUNCTION VAL=\"Syndrome information.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"To Be Implemented\" />" +
            "</BIT_FIELD>";

    public ESR_EL3_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
