package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GivenTwoListOfStringAndConcatThemBoth {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand", "shukla", "satna");
        List<String> list1 = Arrays.asList("Birsinghpur", "Madhya Pradesh");
        List<String> list2 = Stream.concat(list.stream(), list1.stream()).toList();
        System.out.println(list2);
    }
}
