package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondSmallestIntegerFromListUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,7,8,2,0,1,3,4,5,6,7,8,9);
        Optional<Integer> optional = list.stream().sorted().skip(1).findFirst();
        System.out.println(optional.get());
    }


}
