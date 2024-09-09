package com.Interview.codingpractice.array;

public class SearchElementInArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B = 8;
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
