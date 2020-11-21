package com.example.demo.enums;

public class EnumAndClassComparison {


    public static void main(String[] args) {
        System.out.println("using enum: " + EnumSample.REGULAR);
        System.out.println("using class: " + ClassSample.REGULAR);
    }

    enum EnumSample {
        REGULAR, APPLICANT, PROBATIONARY;
    }

    static class ClassSample {
        public static final String REGULAR = "REGULAR";
        public static final String APPLICANT = "APPLICANT";
        public static final String PROBATIONARY = "PROBATIONARY";

    }
}
