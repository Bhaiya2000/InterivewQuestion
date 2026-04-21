package com.Interview.codingpractice.output;

public class StringpoolWithHeap {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
