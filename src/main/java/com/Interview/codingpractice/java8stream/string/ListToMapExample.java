package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand", "shukla", "java");
//        Map<String,Integer> map = list.stream().collect(Collectors.toMap(
//                i-> i, // key
//                i->i.length() // map
//        ));
//        System.out.println(map);
        Map<String,Integer> map = list.stream().collect(Collectors.toMap(
                i->i,
                i -> i.length()
        ));
        System.out.println(map);

    }
}
