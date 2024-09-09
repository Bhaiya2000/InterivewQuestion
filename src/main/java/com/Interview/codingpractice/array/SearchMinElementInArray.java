package com.Interview.codingpractice.array;

public class SearchMinElementInArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println(min);
    }
}
