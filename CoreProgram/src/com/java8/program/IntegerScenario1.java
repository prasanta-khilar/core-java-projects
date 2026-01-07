package com.java8.program;

import java.util.Arrays;

public class IntegerScenario1 {


    public static void main(String[] args) {
        int input = 345678988;
        long input1 = 345678988988L;
        //need to add all characters
        //output = 3+4+5+6+7+8=33
        int sumResult = String.valueOf(input).chars().map(Character::getNumericValue).sum();
        long sumResult1 = String.valueOf(input1).chars().map(Character::getNumericValue).sum();
        System.out.println("Result of int:"+sumResult);
        System.out.println("Result of Long:"+sumResult1);
        String.valueOf(input).chars().map(Character::getNumericValue).sum();
    }
}
