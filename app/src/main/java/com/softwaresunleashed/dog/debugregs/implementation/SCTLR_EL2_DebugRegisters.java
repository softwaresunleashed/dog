package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class SCTLR_EL2_DebugRegisters extends DebugRegisters {

    private String regName = "SCTLR_EL2";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"30\" />" +
            "        <END_BIT VAL=\"31\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"28\" />" +
            "        <END_BIT VAL=\"29\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
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
            "        <FUNCTION VAL=\"Exception endianness\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Big endian\" />" +
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
            "        <START_BIT VAL=\"20\" />" +
            "        <END_BIT VAL=\"21\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"19\" />" +
            "        <END_BIT VAL=\"19\"  />" +
            "        <NAME VAL=\"WXN\" />" +
            "        <FUNCTION VAL=\"Force treatment of all memory regions with write permissions as XN.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Regions with write permissions are forced XN.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Regions with write permissions are not forced XN. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"18\" />" +
            "        <END_BIT VAL=\"18\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
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
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"13\" />" +
            "        <END_BIT VAL=\"15\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"12\" />" +
            "        <END_BIT VAL=\"12\"  />" +
            "        <NAME VAL=\"I\" />" +
            "        <FUNCTION VAL=\"Instruction cache enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Instruction caches enabled.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Instruction caches disabled. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"11\" />" +
            "        <END_BIT VAL=\"11\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"6\" />" +
            "        <END_BIT VAL=\"10\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"4\" />" +
            "        <END_BIT VAL=\"5\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"3\" />" +
            "        <END_BIT VAL=\"3\"  />" +
            "        <NAME VAL=\"SA\" />" +
            "        <FUNCTION VAL=\"Enables stack alignment check\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Enables stack alignment check. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disables stack alignment check.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"2\" />" +
            "        <END_BIT VAL=\"2\"  />" +
            "        <NAME VAL=\"C\" />" +
            "        <FUNCTION VAL=\"Global enable for data and unifies caches\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Enables data and unified caches.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disables data and unified caches. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"1\" />" +
            "        <END_BIT VAL=\"1\"  />" +
            "        <NAME VAL=\"A\" />" +
            "        <FUNCTION VAL=\"Enable alignment fault check\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Enables alignment fault checking.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disables alignment fault checking. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"0\"  />" +
            "        <NAME VAL=\"M\" />" +
            "        <FUNCTION VAL=\"Global enable for the EL2 MMU\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Enables EL2 MMU.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Disables EL2 MMU. This is the reset value.\" />" +
            "</BIT_FIELD>";

    public SCTLR_EL2_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }



}
