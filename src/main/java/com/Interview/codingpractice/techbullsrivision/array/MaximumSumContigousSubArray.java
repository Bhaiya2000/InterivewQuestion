package com.Interview.codingpractice.techbullsrivision.array;

public class MaximumSumContigousSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-3,-1,4,-6,7,8,9,5};
        int n = arr.length;
        int maxSumContinousSubArray = 0;
        int sum =0;
        for(int i =0; i<n; i++){
             sum = sum +arr[i] ;
             if(sum > maxSumContinousSubArray){
                 maxSumContinousSubArray = sum;
             }
             if(sum < 0){
                 sum = 0;
             }
        }

        System.out.println(maxSumContinousSubArray);
    }
}
