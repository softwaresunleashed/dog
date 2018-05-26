package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class SCTLR_EL1_DebugRegisters extends DebugRegisters {

    private String regName = "SCTLR_EL1";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"31\" />" +
            "        <END_BIT VAL=\"31\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"30\" />" +
            "        <END_BIT VAL=\"30\"  />" +
            "        <NAME VAL=\"TE\" />" +
            "        <FUNCTION VAL=\"Thumb Exception enable\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Exceptions, including reset, taken in Thumb state\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Exceptions, including reset, taken in ARM state\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"29\" />" +
            "        <END_BIT VAL=\"29\"  />" +
            "        <NAME VAL=\"AFE\" />" +
            "        <FUNCTION VAL=\"Access flag enable\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"The Access flag. Only the simplified model for access permissions is supported.\" />" +
            "\t\t<VALID_VALUE VAL=\"0\" VAL_MEANING=\"An access permissions bit. The full range of access permissions is supported. No access flag is implemented. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"28\" />" +
            "        <END_BIT VAL=\"28\"  />" +
            "        <NAME VAL=\"TRE\" />" +
            "        <FUNCTION VAL=\"TEX remap enable\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"TEX remap enabled\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"TEX remap disabled\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"26\" />" +
            "        <END_BIT VAL=\"27\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"25\" />" +
            "        <END_BIT VAL=\"25\"  />" +
            "        <NAME VAL=\"EE\" />" +
            "        <FUNCTION VAL=\"Exception Endianness\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Big endian\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Little endian\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"24\" />" +
            "        <END_BIT VAL=\"24\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"22\" />" +
            "        <END_BIT VAL=\"23\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"21\" />" +
            "        <END_BIT VAL=\"21\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"20\" />" +
            "        <END_BIT VAL=\"20\"  />" +
            "        <NAME VAL=\"UWXN\" />" +
            "        <FUNCTION VAL=\"Unprivileged write permission implies EL1 Execute Never(XN)\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Forced to be XN for accesses from software executing at EL1\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Not forced to be XN. This is the reset value\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"19\" />" +
            "        <END_BIT VAL=\"19\"  />" +
            "        <NAME VAL=\"WXN\" />" +
            "        <FUNCTION VAL=\"Write permission implies Execute Never (XN)\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Forced to be XN\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Not forced to be XN. This is the reset value\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"18\" />" +
            "        <END_BIT VAL=\"18\"  />" +
            "        <NAME VAL=\"nTWE\" />" +
            "        <FUNCTION VAL=\"WFE trap\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"WFE instructions executed as normal. This is the reset value\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"A WFE instruction executed at EL0 that causes suspended execution as if the event register is not set and there is no pending WFE wake-up event. It is treated as UNDEFINED.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"17\" />" +
            "        <END_BIT VAL=\"17\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"16\" />" +
            "        <END_BIT VAL=\"16\"  />" +
            "        <NAME VAL=\"nTWI\" />" +
            "        <FUNCTION VAL=\"WFI trap\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"WFI instructions executed as normal. This is the reset value\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"A WFI instruction executed at EL0 that causes suspended execution as if there is not a pending WFI wake-up event. It is treated as UNDEFINED.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"14\" />" +
            "        <END_BIT VAL=\"15\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"13\" />" +
            "        <END_BIT VAL=\"13\"  />" +
            "        <NAME VAL=\"V\" />" +
            "        <FUNCTION VAL=\"Vectors bit. Selects the base address of the exception vectors\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"High exception vectors, base address 0xFFFF0000. This base address is never remapped\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Normal exception vectors, base address 0x00000000. This base address can be remapped\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"12\" />" +
            "        <END_BIT VAL=\"12\"  />" +
            "        <NAME VAL=\"I\" />" +
            "        <FUNCTION VAL=\"Instruction Cache enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Instruction Caches enabled\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Instruction Caches disabled. This is the reset value\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"11\" />" +
            "        <END_BIT VAL=\"11\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"9\" />" +
            "        <END_BIT VAL=\"10\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"8\" />" +
            "        <END_BIT VAL=\"8\"  />" +
            "        <NAME VAL=\"SED\" />" +
            "        <FUNCTION VAL=\"SETEND instruction disable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"SETEND instruction is UNALLOCATED\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"SETEND instruction is enabled. This is the reset value\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"7\" />" +
            "        <END_BIT VAL=\"7\"  />" +
            "        <NAME VAL=\"ITD\" />" +
            "        <FUNCTION VAL=\"IT instruction disable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"All encodings of the IT instruction are UNDEFINED\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"IT instruction functionality is enabled. This is the reset value\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"6\" />" +
            "        <END_BIT VAL=\"6\"  />" +
            "        <NAME VAL=\"THEE\" />" +
            "        <FUNCTION VAL=\"ThumbEE enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"ThumbEE is implemented\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"ThumbEE is not implemented\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"5\" />" +
            "        <END_BIT VAL=\"5\"  />" +
            "        <NAME VAL=\"CP15BEN\" />" +
            "        <FUNCTION VAL=\"AArch32 CP15 barrier enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"CP15 barrier operations enabled. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"CP15 barrier operations disabled.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"3\" />" +
            "        <END_BIT VAL=\"4\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"2\" />" +
            "        <END_BIT VAL=\"2\"  />" +
            "        <NAME VAL=\"C\" />" +
            "        <FUNCTION VAL=\"Cache enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Data and unified caches enabled.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Data and unified caches disabled. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"1\" />" +
            "        <END_BIT VAL=\"1\"  />" +
            "        <NAME VAL=\"A\" />" +
            "        <FUNCTION VAL=\"Alignment check enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Alignment fault checking enabled.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Alignment fault checking disabled. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"0\"  />" +
            "        <NAME VAL=\"M\" />" +
            "        <FUNCTION VAL=\"MMU enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"EL1 and EL0 stage 1 MMU enabled.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"EL1 and EL0 stage 1 MMU disabled. This is the reset value.\" />" +
            "</BIT_FIELD>";

    public SCTLR_EL1_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
