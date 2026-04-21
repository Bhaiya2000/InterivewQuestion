package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class CountIntegerWhichSatisfyEvenCondition {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,3,1,5,23,26,24,28,29);
//        long count  = list.stream().filter(i-> i%2 == 0).count();
//        System.out.println(count);

        long count  = list.stream().filter(i-> i%2 == 0).count();
        System.out.println(count);
    }
}
