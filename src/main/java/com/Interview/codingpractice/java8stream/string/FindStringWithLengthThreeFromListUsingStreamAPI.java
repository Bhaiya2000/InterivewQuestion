package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;

public class FindStringWithLengthThreeFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anand","Shukla","ama","shu","Kla","public");
//        List<String> list1 = list.stream().filter(i-> i.length() ==3 ).toList();
//        System.out.println(list1);

        List<String> list1 = list.stream().filter(i-> i.length() == 3).toList();
        System.out.println(list1);
    }
}
