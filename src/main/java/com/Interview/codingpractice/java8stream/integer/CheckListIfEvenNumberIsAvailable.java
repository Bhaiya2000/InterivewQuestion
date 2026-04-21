package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class CheckListIfEvenNumberIsAvailable {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,2,3,4,8,6);
//        boolean isEvenAvailable = list.stream().anyMatch(i-> i%2 ==0);
//        System.out.println(isEvenAvailable);

        boolean isEvenAvailable = list.stream().anyMatch(i-> i%2 == 0);
        System.out.println(isEvenAvailable);

    }
}
