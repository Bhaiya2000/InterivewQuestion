package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class CountIntegerStartingFromTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,4,23,76,3,4,2,6,26,29);
//        List<Integer> list1 =  list.stream().filter(i-> i.toString().startsWith("2")).toList();
//        System.out.println(list1);

        List<Integer> list1 = list.stream().filter(i-> i.toString().startsWith("2")).toList();
        System.out.println(list1);
    }
}
