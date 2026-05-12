package com.Interview.codingpractice.java8stream.FewVeryImportant;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// In this code we will short the string based on the length
public class SortStringWordBasedOnSize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","shukla","birsinghpur","satna","madhya pradesh","Bangalore");
        List<String> list1 = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list1);
    }
}
