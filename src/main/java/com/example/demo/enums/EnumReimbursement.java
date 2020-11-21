package com.example.demo.enums;

public enum EnumReimbursement {
    COVID_DATA_ALLOWANCE(2500),
    PHONE_ALLOWANCE(2500),
    MEDICINE_ALLOWANCE(1000);

    private double allowance;
    EnumReimbursement(double allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }
}
