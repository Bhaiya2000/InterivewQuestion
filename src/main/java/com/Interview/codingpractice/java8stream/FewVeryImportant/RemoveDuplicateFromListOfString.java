package com.Interview.codingpractice.java8stream.FewVeryImportant;


import java.util.Arrays;
import java.util.List;

// In this code we will remove the duplicate from the list
public class RemoveDuplicateFromListOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","shukla","satna","anand","satna","birsinghpur","bangalore","shukla");
        List<String> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }
}
