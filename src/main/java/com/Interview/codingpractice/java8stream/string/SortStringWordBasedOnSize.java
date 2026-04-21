package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringWordBasedOnSize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anand","shukla","birsinghpur","satna","madhya pradesh");
        List<String> list1 = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list1);
    }
}
