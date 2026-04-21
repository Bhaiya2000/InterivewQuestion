package com.Interview.codingpractice.java8stream.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String str = "abcdefghabcdijklm";
        Character c = str.chars().mapToObj( i-> (char) i).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(i-> i.getValue() == 1).
                map(Map.Entry :: getKey).findFirst().get();
        System.out.println(c);

        Character c1 = str.chars().mapToObj(i-> (char) i)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
                        Collectors.counting())).entrySet().stream().filter(i-> i.getValue() == 1)
                .map(Map.Entry :: getKey) .findFirst().get();
        System.out.println(c1);
    }
}
