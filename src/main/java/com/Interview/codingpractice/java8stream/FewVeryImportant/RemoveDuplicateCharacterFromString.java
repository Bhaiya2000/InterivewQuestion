package com.Interview.codingpractice.java8stream.FewVeryImportant;

import java.util.stream.Collectors;

// In this code we will remove duplicate character from string
public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args) {
        String str = "abcabcdefghi";
        String and  = str.chars().distinct().mapToObj(i->(char)i).map(String::valueOf).collect(Collectors.joining());
        System.out.println(and);
    }
}
