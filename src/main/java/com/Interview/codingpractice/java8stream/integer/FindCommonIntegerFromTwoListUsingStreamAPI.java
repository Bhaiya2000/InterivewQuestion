package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindCommonIntegerFromTwoListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,7,8,2,9);
        List<Integer> list1 = Arrays.asList(5,6,7,8,1,2,3,4);
//        List<Integer> list2 = list.stream().filter(list1::contains).toList();
        List<Integer> list2 =  list.stream().filter(list1::contains).toList();
        System.out.println(list2);

    }
}
