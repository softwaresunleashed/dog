package com.softwaresunleashed.dog.debugregs.base_classes;

public class RegAddr {

    // ARM Core Registers
    public static final String X0 = "20480";
    public static final String X1 = "20481";
    public static final String X2 = "20482";
    public static final String X3 = "20483";
    public static final String X4 = "20484";
    public static final String X5 = "20485";
    public static final String X6 = "20486";
    public static final String X7 = "20487";
    public static final String X8 = "20488";
    public static final String X9 = "20489";
    public static final String X10 = "20490";
    public static final String X11 = "20491";
    public static final String X12 = "20492";
    public static final String X13 = "20493";
    public static final String X14 = "20494";
    public static final String X15 = "20495";
    public static final String X16 = "20496";
    public static final String X17 = "20497";
    public static final String X18 = "20498";
    public static final String X19 = "20499";
    public static final String X20 = "20500";
    public static final String X21 = "20501";
    public static final String X22 = "20502";
    public static final String X23 = "20503";
    public static final String X24 = "20504";
    public static final String X25 = "20505";
    public static final String X26 = "20506";
    public static final String X27 = "20507";
    public static final String X28 = "20508";
    public static final String X29 = "20509";
    public static final String X30 = "20510";
    public static final String SP = "24576";
    public static final String PC = "121385";

    // Special Purpose
    public static final String DLR_EL0 = "121385";  // Same as PC
    public static final String CPSR = "121384"; // CPSR (AARCH32) / PSTATE (AARC64)- Current Program Status Register
    public static final String DSPSR_EL0 = "121384"; // Same as CPSR/PSTATE
    public static final String SP_EL0 = "115208";
    public static final String SP_EL1 = "123400";
    public static final String SP_EL2 = "127496";
    public static final String SP_EL3 = ""; // TODO : No address present in CW DB

    // PSTATE
    public static final String CURRENTEL = "115218";


    //  ESR - Exception Syndrome Register
    public static final String ESR_EL1 = "115344";
    public static final String ESR_EL2 = "123536";
    public static final String ESR_EL3 = "127632";


    // CPUECTLR
    public static final String CPUECTLR_EL1 = "118673";
    // CPUACTLR
    public static final String CPUACTLR_EL1 = "118672";

    // SCTLR - System Control Register
    public static final String SCTLR_EL1 = "114816";
    public static final String SCTLR_EL2 = "123008";
    public static final String SCTLR_EL3 = "127104";



}
