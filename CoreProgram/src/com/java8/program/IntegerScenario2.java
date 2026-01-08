package com.java8.program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerScenario2 {
    public static void main(String[] args) {
        int input = 123456789;
        //reverse int value
        int reverseInt = Integer.parseInt(new StringBuilder(String.valueOf(input)).reverse().toString());
        System.out.println(reverseInt);
        String str = "my name is charakumarswain";
        List<Map.Entry<String, Long>> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect);
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println(isRotation(s1,s2));
    }
    public static boolean isRotation(String s1,String s2){
        if(s1.length()!=s1.length()){
            return false;
        }
        String temp = s1+s1;
        return temp.contains(s2);
    }
}
