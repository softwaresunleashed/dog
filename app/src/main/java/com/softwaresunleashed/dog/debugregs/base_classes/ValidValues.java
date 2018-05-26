package com.softwaresunleashed.dog.debugregs.base_classes;

public class ValidValues {

    int value;
    String meaning;

    public ValidValues(int value, String meaning) {
        this.value = value;
        this.meaning = meaning;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

}
