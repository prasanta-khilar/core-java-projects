package com.java8.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {

    public static void main(String[] args) {
        String str = "my name is charakumarswain";

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println("String Count :"+collect);
        List<Map.Entry<String, Long>> collect1 = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(p -> p.getValue() == 1)
                .collect(Collectors.toList());
        System.out.println("Repeated count :"+collect1);
        Map.Entry<String,Long> higestCOunt= Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println("Highest Count :"+higestCOunt);

    }
}
