package com.softwaresunleashed.dog.debugregs.base_classes;

public class RegAddr {

    //  ESR - Exception Syndrome Register
    public static final String ESR_EL1 = "115344";
    public static final String ESR_EL2 = "123536";
    public static final String ESR_EL3 = "127632";

    // CPSR (AARCH32) / PSTATE (AARC64)- Current Program Status Register
    public static final String CPSR = "121384";

    // CPUECTLR
    public static final String CPUECTLR_EL1 = "118673";
    // CPUACTLR
    public static final String CPUACTLR_EL1 = "118672";

    // SCTLR - System Control Register
    public static final String SCTLR_EL1 = "114816";
    public static final String SCTLR_EL2 = "123008";
    public static final String SCTLR_EL3 = "127104";



}
