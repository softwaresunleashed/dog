package com.softwaresunleashed.dog.debugregs.implementation.CPUACTLR;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPUACTLR_DebugRegisters extends DebugRegisters {

    private String regName = "CPUACTLR";

    private String regDesc = "<BIT_FIELD>" +
            "        <START_BIT VAL=\"45\" />" +
            "        <END_BIT VAL=\"63\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"44\" />" +
            "        <END_BIT VAL=\"44\"  />" +
            "        <NAME VAL=\"ENDCCASCI\" />" +
            "        <FUNCTION VAL=\"Enable data cache clean as data cache clean/invalidate\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Executes data cache clean operations as data cache clean and invalidate.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Normal behavior, data cache clean operations are unaffected. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"31\" />" +
            "        <END_BIT VAL=\"43\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"30\" />" +
            "        <END_BIT VAL=\"30\"  />" +
            "        <NAME VAL=\"FPDIDIS\" />" +
            "        <FUNCTION VAL=\"Disable floating-point dual issue\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Disable dual issue of floating-point, Advanced SIMD and Cryptography instructions.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Enable dual issue of floating-point, Advanced SIMD and Cryptography instructions. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"29\" />" +
            "        <END_BIT VAL=\"29\"  />" +
            "        <NAME VAL=\"DIDIS\" />" +
            "        <FUNCTION VAL=\"Disable Dual Issue\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Disable Dual Issue of all instructions.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Enable Dual Issue of instructions. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"27\" />" +
            "        <END_BIT VAL=\"28\"  />" +
            "        <NAME VAL=\"RADIS\" />" +
            "        <FUNCTION VAL=\"Write streaming no-allocate threshold\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"16th consecutive streaming cache line does not allocate in the L1 or L2 cache.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"128th consecutive streaming cache line does not allocate in the L1 or L2 cache. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"512th consecutive streaming cache line does not allocate in the L1 or L2 cache.\" />" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"Disables streaming. All write-allocate lines allocate in the L1 or L2 cache.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"25\" />" +
            "        <END_BIT VAL=\"26\"  />" +
            "        <NAME VAL=\"L1RADIS\" />" +
            "        <FUNCTION VAL=\"Write streaming no-L1-allocate threshold\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"4th consecutive streaming cache line does not allocate in the L1 cache. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"64th consecutive streaming cache line does not allocate in the L1 cache.\" />" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"128th consecutive streaming cache line does not allocate in the L1 cache.\" />" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"Disables streaming. All write-allocate lines allocate in the L1 cache.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"24\" />" +
            "        <END_BIT VAL=\"24\"  />" +
            "        <NAME VAL=\"DTAH\" />" +
            "        <FUNCTION VAL=\"Disable Transient Allocation Hint\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"The Transient allocation hint in the MAIR is ignored and treated the same as non-transient allocation types. The LDNP and STNP instructions in AArch64 behave the same as the equivalent LDP and STP instructions. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Normal operation.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"23\" />" +
            "        <END_BIT VAL=\"23\"  />" +
            "        <NAME VAL=\"STBPFRS\" />" +
            "        <FUNCTION VAL=\"Disable ReadUnique request for prefetch streams initiated by STB accesses\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"ReadShared used for prefetch streams initiated from STB accesses.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"ReadUnique used for prefetch streams initiated from STB accesses. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"22\" />" +
            "        <END_BIT VAL=\"22\"  />" +
            "        <NAME VAL=\"STBPFDIS\" />" +
            "        <FUNCTION VAL=\"Disable prefetch streams initiated from STB accesses\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Disable Prefetch streams initiated from STB accesses.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Enable Prefetch streams initiated from STB accesses. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"21\" />" +
            "        <END_BIT VAL=\"21\"  />" +
            "        <NAME VAL=\"IFUTHDIS\" />" +
            "        <FUNCTION VAL=\"IFU fetch throttle disabled.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Fetch throttle disabled. This setting increases power consumption.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Fetch throttle enabled. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"19\" />" +
            "        <END_BIT VAL=\"20\"  />" +
            "        <NAME VAL=\"NPFSTRM\" />" +
            "        <FUNCTION VAL=\"Number of independent data prefetch streams\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"1 stream.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"2 streams. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"3 streams.\" />" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"4 streams.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"18\" />" +
            "        <END_BIT VAL=\"18\"  />" +
            "        <NAME VAL=\"DSTDIS\" />" +
            "        <FUNCTION VAL=\"Enable device split throttle.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"Device split throttle enabled. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Device split throttle disabled.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"17\" />" +
            "        <END_BIT VAL=\"17\"  />" +
            "        <NAME VAL=\"STRIDE\" />" +
            "        <FUNCTION VAL=\"Enable stride detection.\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"3 consecutive strides to trigger prefetch.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"2 consecutive strides to trigger prefetch. This is the reset value.\" />" +
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
            "        <NAME VAL=\"L1PCTL\" />" +
            "        <FUNCTION VAL=\"L1 Data prefetch control. The value of the this field determines the maximum number of outstanding data prefetches allowed in the L1 memory system, excluding those generated by software load or PLD instructions.\" />" +
            "\t\t<VALID_VALUE VAL=\"0\" VAL_MEANING=\"Prefetch disabled.\" />" +
            "        <VALID_VALUE VAL=\"1\" VAL_MEANING=\"1 outstanding prefetch allowed.\" />" +
            "        <VALID_VALUE VAL=\"2\" VAL_MEANING=\"2 outstanding prefetches allowed.\" />" +
            "        <VALID_VALUE VAL=\"3\" VAL_MEANING=\"3 outstanding prefetches allowed.\" />" +
            "        <VALID_VALUE VAL=\"4\" VAL_MEANING=\"4 outstanding prefetches allowed.\" />" +
            "        <VALID_VALUE VAL=\"5\" VAL_MEANING=\"5 outstanding prefetches allowed. This is the reset value.\" />" +
            "        <VALID_VALUE VAL=\"6\" VAL_MEANING=\"6 outstanding prefetches allowed.\" />" +
            "        <VALID_VALUE VAL=\"7\" VAL_MEANING=\"8 outstanding prefetches allowed.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"11\" />" +
            "        <END_BIT VAL=\"12\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"10\" />" +
            "        <END_BIT VAL=\"10\"  />" +
            "        <NAME VAL=\"DODMBS\" />" +
            "        <FUNCTION VAL=\"Disable optimized Data Memory Barrier behavior\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Disable optimized Data Memory Barrier behavior.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Enable optimized Data Memory Barrier behavior. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"7\" />" +
            "        <END_BIT VAL=\"9\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"6\" />" +
            "        <END_BIT VAL=\"6\"  />" +
            "        <NAME VAL=\"L1DEIEN\" />" +
            "        <FUNCTION VAL=\"L1 D-cache data RAM error injection enable\" />" +
            "\t\t<VALID_VALUE VAL=\"1\" VAL_MEANING=\"Double-bit errors are injected on all writes to the L1 D-cache data RAMs for the first word of each 32-byte region.\" />" +
            "        <VALID_VALUE VAL=\"0\" VAL_MEANING=\"Normal behavior, errors are not injected. This is the reset value.\" />" +
            "</BIT_FIELD>" +
            "<BIT_FIELD>" +
            "        <START_BIT VAL=\"0\" />" +
            "        <END_BIT VAL=\"5\"  />" +
            "        <NAME VAL=\"-\" />" +
            "        <FUNCTION VAL=\"Reserved\" />" +
            "</BIT_FIELD>";

    public CPUACTLR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
