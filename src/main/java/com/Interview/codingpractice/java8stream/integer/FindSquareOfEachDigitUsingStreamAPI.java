package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfEachDigitUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,3,2);
//        List<Integer> list1 = list.stream().map(i->i*i).toList();
//        System.out.println(list1);
        List<Integer> list1 = list.stream().map(i->i*i).toList();
        System.out.println(list1);
    }
}


// need to start from here