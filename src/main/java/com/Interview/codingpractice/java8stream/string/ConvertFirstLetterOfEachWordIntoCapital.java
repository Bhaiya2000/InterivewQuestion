package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;

public class ConvertFirstLetterOfEachWordIntoCapital {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("anand", "shukla","satna","bangalore");

//    List<String > list1 = list.stream()
//            .map(i-> i.substring(0,1).toUpperCase()+i.substring(1)).toList();
//        System.out.println(list1);

//    List<String> list2 = list.stream().map(i-> i.substring(0,1).toUpperCase()+i.substring(1)).toList();
//        System.out.println(list2);
        List<String > list1 = list.stream().map(i->i.substring(0,1)
                .toUpperCase()+i.substring(1)).toList();
        System.out.println(list1);

    }
}
