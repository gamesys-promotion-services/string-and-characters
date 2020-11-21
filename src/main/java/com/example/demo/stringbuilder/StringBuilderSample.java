package com.example.demo.stringbuilder;

public class StringBuilderSample {


    public static void main (String[] args) {
        StringBuilder stringBuilder = new StringBuilder("start");
        StringBuilder stringBuilder2 = new StringBuilder("start");

        System.out.println(stringBuilder.append("le"));
        System.out.println(stringBuilder2.insert(4, "le"));
    }
}
