package com.Interview.codingpractice.subarray;

public class MaximumSumContigousSubArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, -10};
        int n = A.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (maxSum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
