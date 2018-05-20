package com.softwaresunleashed.dog.debugregs;

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

            default:
                break;
        };

        return debugRegisters;
    }


}
