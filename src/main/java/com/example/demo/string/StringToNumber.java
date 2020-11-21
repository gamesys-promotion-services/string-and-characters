package com.example.demo.string;

public class StringToNumber {
    public static void main(String[] args) {
        String stringValue = "1991";
        String yearInString = stringValue + 1;
        int yearInInt = Integer.parseInt(stringValue) + 2;
        long yearInLong = Long.parseLong(stringValue) + 3;
        float yearInFloat = Float.parseFloat(stringValue) + 4;
        double yearInDouble = Double.parseDouble(stringValue) + 5;

        System.out.println("String: " + yearInString);
        System.out.println("Int: " + yearInInt);
        System.out.println("Long: " + yearInLong);
        System.out.println("Float: " + yearInFloat);
        System.out.println("Double: " + yearInDouble);
    }
}
