package com.Interview.codingpractice.subarray;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int n = A.length;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int left = i+1;
            int right = (n-1) - i+1;
            count  = left * right;
            sum = sum + (count*A[i]);
        }
        System.out.println(sum);
    }
}
