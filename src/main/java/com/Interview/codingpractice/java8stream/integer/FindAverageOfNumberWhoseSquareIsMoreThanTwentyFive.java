package com.Interview.codingpractice.java8stream.integer;

import java.util.Arrays;
import java.util.List;

public class FindAverageOfNumberWhoseSquareIsMoreThanTwentyFive {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        double avg = list.stream().map(i-> i*i).filter(i-> i>25)
//                .mapToInt(i-> i).average().getAsDouble();
//        System.out.println(avg);

        double average = list.stream().map(i->i*i).filter(i-> i>25).mapToInt(i->i)
                .average().getAsDouble();
        System.out.println(average);
    }
}
