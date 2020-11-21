package com.example.demo.string;

public class StringWithRegex {


    public static void main (String[] args) {

        /** regex for all digits */
        String allDigits = "[0-9]";

        /** regex only for letters a,b,c and d */
        String abc = "[abcd]";

        String sampleString = "hola 123 world 456";
        System.out.println(sampleString.replaceAll(allDigits, ""));
        System.out.println(sampleString.replaceAll(abc, ""));
    }
}
