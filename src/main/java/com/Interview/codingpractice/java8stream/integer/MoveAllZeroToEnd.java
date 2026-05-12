package com.Interview.codingpractice.java8stream.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,-2,0,-4,0,5,-1,0,-3,7,8,3);
//        List<Integer> list1 = Stream.concat(
//                list.stream().filter(i-> i != 0),
//                list.stream().filter(i-> i == 0)
//        ).toList();
//
//
//        List<Integer> list2 = Stream.concat(
//                list.stream().filter(i-> i != 0),
//                list.stream().filter(i->i == 0)
//        ).toList();
//        System.out.println(list1);

        List<Integer> list1 = Stream.concat(
                list.stream().filter(i-> i != 0),
                list.stream().filter(i-> i == 0)
        ).toList();
        System.out.println(list1);

    }
}
