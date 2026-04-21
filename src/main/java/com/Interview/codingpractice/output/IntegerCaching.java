package com.Interview.codingpractice.output;

public class IntegerCaching {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;

        Integer x = 128;
        Integer y = 128;

        System.out.println(a == b);
        System.out.println(x == y);
    }
}
