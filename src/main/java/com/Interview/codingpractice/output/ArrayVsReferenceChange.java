package com.Interview.codingpractice.output;

public class ArrayVsReferenceChange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        modify(arr);
        System.out.println(arr[0]);
    }

    static void modify(int[] arr) {
        arr[0] = 99;
    }
}
