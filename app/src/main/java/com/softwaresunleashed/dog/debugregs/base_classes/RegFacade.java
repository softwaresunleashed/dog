package com.softwaresunleashed.dog.debugregs.base_classes;

import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.PC_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.SP_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X0_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.CPSR.CPSR_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X10_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X11_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X12_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X13_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X14_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X15_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X16_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X17_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X18_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X19_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X1_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X20_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X21_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X22_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X23_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X24_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X25_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X26_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X27_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X28_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X29_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X2_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X30_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X3_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X4_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X5_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X6_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X7_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X8_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CORE.GPR.X9_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CPUACTLR.CPUACTLR_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CPUECTLR.CPUECTLR_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.Dummy_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.ESR.ESR_EL1_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.ESR.ESR_EL2_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.ESR.ESR_EL3_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.PSTATE.CURRRENTEL_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SCTLR.SCTLR_EL1_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SCTLR.SCTLR_EL2_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SCTLR.SCTLR_EL3_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE.DLR_EL0_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE.SP_EL0_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE.SP_EL1_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE.SP_EL2_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SPECIAL_PURPOSE.SP_EL3_DebugRegisters;

public class RegFacade {

    public static DebugRegisters getRegisterInstance(String regAddress) {

        DebugRegisters debugRegisters = null;

        switch (regAddress){

            // ARM CORE
            case RegAddr.X0:
                debugRegisters = new X0_DebugRegisters();
                break;
            case RegAddr.X1:
                debugRegisters = new X1_DebugRegisters();
                break;
            case RegAddr.X2:
                debugRegisters = new X2_DebugRegisters();
                break;
            case RegAddr.X3:
                debugRegisters = new X3_DebugRegisters();
                break;
            case RegAddr.X4:
                debugRegisters = new X4_DebugRegisters();
                break;
            case RegAddr.X5:
                debugRegisters = new X5_DebugRegisters();
                break;
            case RegAddr.X6:
                debugRegisters = new X6_DebugRegisters();
                break;
            case RegAddr.X7:
                debugRegisters = new X7_DebugRegisters();
                break;
            case RegAddr.X8:
                debugRegisters = new X8_DebugRegisters();
                break;
            case RegAddr.X9:
                debugRegisters = new X9_DebugRegisters();
                break;
            case RegAddr.X10:
                debugRegisters = new X10_DebugRegisters();
                break;
            case RegAddr.X11:
                debugRegisters = new X11_DebugRegisters();
                break;
            case RegAddr.X12:
                debugRegisters = new X12_DebugRegisters();
                break;
            case RegAddr.X13:
                debugRegisters = new X13_DebugRegisters();
                break;
            case RegAddr.X14:
                debugRegisters = new X14_DebugRegisters();
                break;
            case RegAddr.X15:
                debugRegisters = new X15_DebugRegisters();
                break;
            case RegAddr.X16:
                debugRegisters = new X16_DebugRegisters();
                break;
            case RegAddr.X17:
                debugRegisters = new X17_DebugRegisters();
                break;
            case RegAddr.X18:
                debugRegisters = new X18_DebugRegisters();
                break;
            case RegAddr.X19:
                debugRegisters = new X19_DebugRegisters();
                break;
            case RegAddr.X20:
                debugRegisters = new X20_DebugRegisters();
                break;
            case RegAddr.X21:
                debugRegisters = new X21_DebugRegisters();
                break;
            case RegAddr.X22:
                debugRegisters = new X22_DebugRegisters();
                break;
            case RegAddr.X23:
                debugRegisters = new X23_DebugRegisters();
                break;
            case RegAddr.X24:
                debugRegisters = new X24_DebugRegisters();
                break;
            case RegAddr.X25:
                debugRegisters = new X25_DebugRegisters();
                break;
            case RegAddr.X26:
                debugRegisters = new X26_DebugRegisters();
                break;
            case RegAddr.X27:
                debugRegisters = new X27_DebugRegisters();
                break;
            case RegAddr.X28:
                debugRegisters = new X28_DebugRegisters();
                break;
            case RegAddr.X29:
                debugRegisters = new X29_DebugRegisters();
                break;
            case RegAddr.X30:
                debugRegisters = new X30_DebugRegisters();
                break;
            case RegAddr.SP:
                debugRegisters = new SP_DebugRegisters();
                break;
            case RegAddr.PC:
                debugRegisters = new PC_DebugRegisters();
                break;

            // Special Purpose
//            case RegAddr.DLR_EL0:
//                debugRegisters = new DLR_EL0_DebugRegisters();
//                break;
            case RegAddr.SP_EL0:
                debugRegisters = new SP_EL0_DebugRegisters();
                break;
            case RegAddr.SP_EL1:
                debugRegisters = new SP_EL1_DebugRegisters();
                break;
            case RegAddr.SP_EL2:
                debugRegisters = new SP_EL2_DebugRegisters();
                break;
            case RegAddr.SP_EL3:
                debugRegisters = new SP_EL3_DebugRegisters();
                break;

            case RegAddr.CURRENTEL:
                debugRegisters = new CURRRENTEL_DebugRegisters();
                break;






            case RegAddr.ESR_EL1:
                debugRegisters = new ESR_EL1_DebugRegisters();
                break;
            case RegAddr.ESR_EL2:
                debugRegisters = new ESR_EL2_DebugRegisters();
                break;
            case RegAddr.ESR_EL3:
                debugRegisters = new ESR_EL3_DebugRegisters();
                break;

            case RegAddr.CPSR:
                debugRegisters = new CPSR_DebugRegisters();
                break;

            case RegAddr.CPUECTLR_EL1:
                debugRegisters = new CPUECTLR_DebugRegisters();
                break;

            case RegAddr.CPUACTLR_EL1:
                debugRegisters = new CPUACTLR_DebugRegisters();
                break;

            case RegAddr.SCTLR_EL1:
                debugRegisters = new SCTLR_EL1_DebugRegisters();
                break;
            case RegAddr.SCTLR_EL2:
                debugRegisters = new SCTLR_EL2_DebugRegisters();
                break;
            case RegAddr.SCTLR_EL3:
                debugRegisters = new SCTLR_EL3_DebugRegisters();
                break;

            default:
                debugRegisters = new Dummy_DebugRegisters();
                break;
        };

        return debugRegisters;
    }


}
