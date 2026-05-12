package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfIntegerofGreaterThanXUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,3,2);
//        List<Integer> list1 = list.stream().filter(i-> i>1).map(i-> i*i).toList();
//        System.out.println(list1);

        List<Integer> list1 =  list.stream().filter(i-> i>2).map(i-> i*i).toList();
        System.out.println(list1);

    }
}
