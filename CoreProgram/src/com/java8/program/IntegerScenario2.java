package com.java8.program;

public class IntegerScenario2 {
    public static void main(String[] args) {
        int input = 3456789;
        //reverse int value

        int reversedString = Integer.parseInt(new StringBuilder(String.valueOf(input)).reverse().toString());
        System.out.println(reversedString);
    }
}
