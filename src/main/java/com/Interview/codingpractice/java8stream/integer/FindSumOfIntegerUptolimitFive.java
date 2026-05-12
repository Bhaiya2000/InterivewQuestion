package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindSumOfIntegerUptolimitFive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,1,5,6,7,1,2,3,4);
//        int sum = list.stream().sorted().limit(5).reduce((a,b) -> a+b).get();
//        System.out.println(sum);
        int sum = list.stream().limit(5).reduce((a,b)-> a+b).get();
        System.out.println(sum);
    }
}


// expected output should be 9