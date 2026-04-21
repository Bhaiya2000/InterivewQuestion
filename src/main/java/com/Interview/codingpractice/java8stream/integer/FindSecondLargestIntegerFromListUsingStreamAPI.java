package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestIntegerFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,3,6,7,9,3,4,5,6,7,8);
        int max = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(max);
    }
}
