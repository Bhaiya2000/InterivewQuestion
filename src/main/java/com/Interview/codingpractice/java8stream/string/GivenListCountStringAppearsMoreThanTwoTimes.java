package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GivenListCountStringAppearsMoreThanTwoTimes {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","shukla","birsinghpur","satna","madhya pradesh","anand","satna");
//        List<String> list1 = list.stream().collect(Collectors.groupingBy(
//                i-> i, Collectors.counting())).entrySet().stream().filter(i-> i.getValue() > 1)
//                .map(Map.Entry :: getKey).toList();
//        System.out.println(list1);

        List<String> list1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(i-> i.getValue() >1).map(Map.Entry :: getKey).toList();
        System.out.println(list1);
    }
}
