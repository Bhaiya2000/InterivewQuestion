package com.Interview.codingpractice.java8stream.string;

public class PrintCountOfParticularCharacterUsingStreamAPI {
    public static void main(String[] args) {
        String s = "anand";
       long count  = s.chars().filter(i-> i == 'a').count();
        System.out.println(count);
    }
}
