package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindSumOfIntegersOfListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,2,3,4,5,6,7,8,9);
        int sum = list.stream().reduce((a,b) -> a+b).get();
        System.out.println(sum);
    }
}
