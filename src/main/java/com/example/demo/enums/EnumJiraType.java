package com.example.demo.enums;

public enum EnumJiraType {

    IMPROVEMENT("MEDIUM"), INC("HIGH"), INVESTIGATION("LOW");


    private String value;

    EnumJiraType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
