package com.Interview.codingpractice.techbullsrivision.array;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n  = arr.length;
        int sum = 0;
        int count = 0;

        for(int i =0; i<n; i++){
            int left  = i+1;
            int right = (n-1)-i+1;
            count  = left * right;
            sum =  sum + (count *arr[i]);
        }

        System.out.println("Sum of all sub array : "+sum);

    }
}
