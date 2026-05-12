package com.Interview.codingpractice.java8stream.integer;

import com.Interview.codingpractice.designpattern.singleton.rivision.rivision2.DoubleCheckLocking;

import java.util.Arrays;
import java.util.List;

public class FindAverageofListIntegerUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,3,2,5,6,7,8);

//        double average = list.stream().mapToInt(i-> i).average().getAsDouble();
//        System.out.println(average);
//        double average  = list.stream().mapToInt(i->i).average().getAsDouble();
//        System.out.println(average);

//        Double average  = list.stream().mapToInt(i-> i).average().getAsDouble();
//        System.out.println(average);

//       Double avg = list.stream().mapToInt(i-> i).average().getAsDouble();
//        System.out.println(avg);


        double avg = list.stream().mapToInt(i-> i).average().getAsDouble();
        System.out.println(avg);
    }
}
