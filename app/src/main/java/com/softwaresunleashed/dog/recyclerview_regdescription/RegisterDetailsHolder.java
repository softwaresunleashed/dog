package com.softwaresunleashed.dog.recyclerview_regdescription;

public class RegisterDetailsHolder {

    public RegisterDetailsHolder() {
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterValue() {
        return registerValue;
    }

    public void setRegisterValue(String registerValue) {
        this.registerValue = registerValue;
    }

    public String getRegisterDescription() {
        return registerDescription;
    }

    public void setRegisterDescription(String registerDescription) {
        this.registerDescription = registerDescription;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }


    String registerName;
    String registerValue;
    String registerAddress;
    String registerDescription;
}
