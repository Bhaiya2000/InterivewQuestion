package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;

public class FindStringStartingFromSLetterUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","satna","shukjla","aba");
//        List<String> list1 = list.stream().filter(i-> i.startsWith("s")).toList();
//        System.out.println(list1);
        List<String > list1 = list.stream().filter(i-> i.startsWith("s")).toList();
        System.out.println(list1);

    }
}
