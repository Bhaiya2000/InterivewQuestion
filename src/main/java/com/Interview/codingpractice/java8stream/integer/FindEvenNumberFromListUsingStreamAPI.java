package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,4,3,6,8,12,10);
        List<Integer> list1 = list.stream().filter(i-> i%2 ==0).toList();
        System.out.println(list1);
    }
}
