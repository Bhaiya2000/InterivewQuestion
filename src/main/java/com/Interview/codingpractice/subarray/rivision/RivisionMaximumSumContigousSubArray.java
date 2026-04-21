package com.Interview.codingpractice.subarray.rivision;

public class RivisionMaximumSumContigousSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, -10};
        int n = arr.length;
        int sum = 0;
        int maxSum =  Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            sum += arr[i];
            if(maxSum < sum ){
                maxSum =  sum;
            }
            if(maxSum < 0){
                sum =  0;
            }
        }
        System.out.println(maxSum);
    }
}
