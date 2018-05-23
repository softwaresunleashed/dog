package com.softwaresunleashed.dog.debugregs.implementation;

import com.softwaresunleashed.dog.debugregs.base_classes.DebugRegisters;

public class CPUACTLR_DebugRegisters extends DebugRegisters {

    private String regName = "CPUACTLR";

    private String regDesc = "[63:45]\t-\tReserved, res0.\n" +
            "[44]\tENDCCASCI\t\n" +
            "Enable data cache clean as data cache clean/invalidate. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Normal behavior, data cache clean operations are unaffected. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Executes data cache clean operations as data cache clean and invalidate. The following operations are affected:\n" +
            "\n" +
            "In AArch32, DCCSW is executed as DCCISW, DCCMVAU and DCCMVAC are executed as DCCIMVAC.\n" +
            "\n" +
            "In AArch64, DC CSW is executed as DC CISW, DC CVAU and DC CVAC are executed as DC CIVAC.\n" +
            "\n" +
            "[43:31\t-\tReserved, res0.\n" +
            "[30]\tFPDIDIS\t\n" +
            "Disable floating-point dual issue. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Enable dual issue of floating-point, Advanced SIMD and Cryptography instructions. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Disable dual issue of floating-point, Advanced SIMD and Cryptography instructions.\n" +
            "\n" +
            "[29]\tDIDIS\t\n" +
            "Disable Dual Issue. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Enable Dual Issue of instructions. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Disable Dual Issue of all instructions.\n" +
            "\n" +
            "[28:27]\tRADIS\t\n" +
            "Write streaming no-allocate threshold. The possible values are:\n" +
            "\n" +
            "0b00\n" +
            "16th consecutive streaming cache line does not allocate in the L1 or L2 cache.\n" +
            "\n" +
            "0b01\n" +
            "128th consecutive streaming cache line does not allocate in the L1 or L2 cache. This is the reset value.\n" +
            "\n" +
            "0b10\n" +
            "512th consecutive streaming cache line does not allocate in the L1 or L2 cache.\n" +
            "\n" +
            "0b11\n" +
            "Disables streaming. All write-allocate lines allocate in the L1 or L2 cache.\n" +
            "\n" +
            "[26:25]\tL1RADIS\t\n" +
            "Write streaming no-L1-allocate threshold. The possible values are:\n" +
            "\n" +
            "0b00\n" +
            "4th consecutive streaming cache line does not allocate in the L1 cache. This is the reset value.\n" +
            "\n" +
            "0b01\n" +
            "64th consecutive streaming cache line does not allocate in the L1 cache.\n" +
            "\n" +
            "0b10\n" +
            "128th consecutive streaming cache line does not allocate in the L1 cache.\n" +
            "\n" +
            "0b11\n" +
            "Disables streaming. All write-allocate lines allocate in the L1 cache.\n" +
            "\n" +
            "[24]\tDTAH\t\n" +
            "Disable Transient allocation hint. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Normal operation.\n" +
            "\n" +
            "1\n" +
            "The Transient allocation hint in the MAIR is ignored and treated the same as non-transient allocation types. The LDNP and STNP instructions in AArch64 behave the same as the equivalent LDP and STP instructions. This is the reset value.\n" +
            "\n" +
            "[23]\tSTBPFRS\t\n" +
            "Disable ReadUnique request for prefetch streams initiated by STB accesses:\n" +
            "\n" +
            "0\n" +
            "ReadUnique used for prefetch streams initiated from STB accesses. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "ReadShared used for prefetch streams initiated from STB accesses.\n" +
            "\n" +
            "[22]\tSTBPFDIS\t\n" +
            "Disable prefetch streams initiated from STB accesses:\n" +
            "\n" +
            "0\n" +
            "Enable Prefetch streams initiated from STB accesses. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Disable Prefetch streams initiated from STB accesses.\n" +
            "\n" +
            "[21]\tIFUTHDIS\t\n" +
            "IFU fetch throttle disabled. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Fetch throttle enabled. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Fetch throttle disabled. This setting increases power consumption.\n" +
            "\n" +
            "[20:19]\tNPFSTRM\t\n" +
            "Number of independent data prefetch streams. The possible values are:\n" +
            "\n" +
            "0b00\n" +
            "1 stream.\n" +
            "\n" +
            "0b01\n" +
            "2 streams. This is the reset value.\n" +
            "\n" +
            "0b10\n" +
            "3 streams.\n" +
            "\n" +
            "0b11\n" +
            "4 streams.\n" +
            "\n" +
            "[18]\tDSTDIS\t\n" +
            "Enable device split throttle. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Device split throttle disabled.\n" +
            "\n" +
            "1\n" +
            "Device split throttle enabled. This is the reset value.\n" +
            "\n" +
            "[17]\tSTRIDE\t\n" +
            "Enable stride detection. The possible values are:\n" +
            "\n" +
            "0\n" +
            "2 consecutive strides to trigger prefetch. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "3 consecutive strides to trigger prefetch.\n" +
            "\n" +
            "[16]\t-\tReserved, res0.\n" +
            "[15:13]\tL1PCTL\t\n" +
            "L1 Data prefetch control. The value of the this field determines the maximum number of outstanding data prefetches allowed in the L1 memory system, excluding those generated by software load or PLD instructions. The possible values are:\n" +
            "\n" +
            "0b000\n" +
            "Prefetch disabled.\n" +
            "\n" +
            "0b001\n" +
            "1 outstanding prefetch allowed.\n" +
            "\n" +
            "0b010\n" +
            "2 outstanding prefetches allowed.\n" +
            "\n" +
            "0b011\n" +
            "3 outstanding prefetches allowed.\n" +
            "\n" +
            "0b100\n" +
            "4 outstanding prefetches allowed.\n" +
            "\n" +
            "0b101\n" +
            "5 outstanding prefetches allowed. This is the reset value.\n" +
            "\n" +
            "0b110\n" +
            "6 outstanding prefetches allowed.\n" +
            "\n" +
            "0b111\n" +
            "8 outstanding prefetches allowed.\n" +
            "\n" +
            "[12:11]\t-\tReserved, res0.\n" +
            "[10]\tDODMBS\t\n" +
            "Disable optimized Data Memory Barrier behavior. The possible values are:\n" +
            "\n" +
            "0\n" +
            "Enable optimized Data Memory Barrier behavior. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Disable optimized Data Memory Barrier behavior.\n" +
            "\n" +
            "[9:7]\t-\tReserved, res0.\n" +
            "[6]\tL1DEIEN\t\n" +
            "L1 D-cache data RAM error injection enable. The possible values are;\n" +
            "\n" +
            "0\n" +
            "Normal behavior, errors are not injected. This is the reset value.\n" +
            "\n" +
            "1\n" +
            "Double-bit errors are injected on all writes to the L1 D-cache data RAMs for the first word of each 32-byte region.\n" +
            "\n" +
            "[5:0]\t-\tReserved, res0.\n";

    public CPUACTLR_DebugRegisters() {
        setRegister_description(regDesc);
        setRegister_name(regName);
    }


}
