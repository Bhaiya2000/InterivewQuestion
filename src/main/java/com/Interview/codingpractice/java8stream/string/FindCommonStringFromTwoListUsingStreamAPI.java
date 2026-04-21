package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;

public class FindCommonStringFromTwoListUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","shukla","satna","bangalore");
        List<String> list1 = Arrays.asList("bangalore","shukla","shivani","krish");
        List<String> list2 = list.stream().filter(list1::contains).toList();
        System.out.println(list2);
    }
}
