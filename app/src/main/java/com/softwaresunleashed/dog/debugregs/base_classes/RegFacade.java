package com.softwaresunleashed.dog.debugregs.base_classes;

import com.softwaresunleashed.dog.debugregs.implementation.CPSR_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CPUACTLR_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.CPUECTLR_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.Dummy_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.ESR_EL1_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.ESR_EL2_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.ESR_EL3_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SCTLR_EL1_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SCTLR_EL2_DebugRegisters;
import com.softwaresunleashed.dog.debugregs.implementation.SCTLR_EL3_DebugRegisters;

public class RegFacade {

    public static DebugRegisters getRegisterInstance(String regAddress) {

        DebugRegisters debugRegisters = null;

        switch (regAddress){

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
