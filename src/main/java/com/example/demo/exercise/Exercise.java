package com.example.demo.exercise;

/**
 * Exercise:
 *
 * validateUserInput(String value) should be able to remove all
 * non-numeric characters and
 * return an int value.
 *
 * If the parameter has no numeric value,
 * return 0.
 *
 * But if the parameter have "COVID"
 * Return 2019 instead.
 *
 * e.g. passing "Hello 123!945world678" will return 123945678
 * e.g. passing "hello world" will return 0
 * e.g. passing "280covid29471920 world" will return 2019
 * e.g. passing covid world will return 2019
 */
public class Exercise {
    public static void main(String[] args) {
        System.out.println(validateUserInput("280covid29471920"));
        System.out.println(validateUserInput("Hello 123!945world678"));
        System.out.println(validateUserInput("hello world"));
        System.out.println(validateUserInput("covid world"));
        /**
         * output of above should be
         * 2019
         * 123945678
         * 0
         * 2019
         */
    }

    private static int validateUserInput(String value) {
        int amount = 0;
        return amount;
    }
}
