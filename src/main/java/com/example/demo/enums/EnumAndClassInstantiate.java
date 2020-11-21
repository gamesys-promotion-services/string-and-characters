package com.example.demo.enums;

import com.example.demo.enums.*;

public class EnumAndClassInstantiate {
    public static void main(String[] a) {
//        EnumJiraTypeSample enumJiraTypeSample = new EnumJiraTypeSample();
        ClassSample classSample = new ClassSample();
        for (EnumJiraTypeSample enums: EnumJiraTypeSample.values()) {
            System.out.println(enums.ordinal() + " - " + enums);
        }
    }

    enum EnumJiraTypeSample {
        IMPROVEMENT("MEDIUM"), INC("HIGH"), INVESTIGATION("LOW");

        private String value;

        EnumJiraTypeSample(String value) {
            this.value = value;
        }
        EnumJiraTypeSample() {
        }

        public String getValue() {
            return value;
        }
    }

    static class ClassSample {
        private String value;
        ClassSample(String value) {
            this.value = value;
        }
        public ClassSample() {

        }
        public String getValue() {
            return value;
        }
    }
}
