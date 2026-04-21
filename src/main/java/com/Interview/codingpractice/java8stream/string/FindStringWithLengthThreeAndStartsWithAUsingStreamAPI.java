package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;

public class FindStringWithLengthThreeAndStartsWithAUsingStreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","Ana","shukla","Ama");
        List<String> list1 = list.stream().filter(i-> i.startsWith("A") && i.length() == 3).toList();
        System.out.println(list1);
    }
}
