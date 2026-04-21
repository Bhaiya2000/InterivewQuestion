package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateIntegerUsingJavaStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,4,-2,0,-4,0,5,-1,0,-3,7,8,3);
//      List<Integer> list1 = list.stream().
//                collect(Collectors.groupingBy(i->i,Collectors.counting()))
//                .entrySet().stream().filter(i-> i.getValue() > 1)
//              .map(Map.Entry :: getKey)
//              .collect(Collectors.toList());
//        System.out.println(list1);


      List<Integer> list1 = list.stream()
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
              .entrySet().stream().filter(i->i.getValue() > 1).map(Map.Entry :: getKey)
              .collect(Collectors.toList());
        System.out.println(list1);
    }
}

