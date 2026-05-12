package com.Interview.codingpractice.java8stream.FewVeryImportant;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// In this code we will sort the String on reverse order but based on length
public class SortStringWordBasedOnSizeReverseOrder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anand","sHUKLA","satna","birsinghpur","Majhiyar","Shukwah");
        List<String> list1 = list.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
        System.out.println(list1);
    }
}
