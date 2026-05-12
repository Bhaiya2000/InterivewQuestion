package com.Interview.codingpractice.newdsaquestion;

public class LargestSubarrayAum {
    public static void main(String[] args) {
//        int arr[] =  {1,2,-1,3,2,-4,-5,4,5,6,7};
//        int n = arr.length;
//        int maxSum = 0;
//        int sum =0;
//        for(int i=0; i<n; i++){
//            sum += arr[i];
//            if(maxSum < sum){
//                maxSum = sum;
//            }
//            if(sum < 0){
//                sum = 0;
//            }
//        }
//        System.out.println(maxSum);
        int arr[] = {1,2,-1,3,2,-4,-5,4,5,6,7};
        int n = arr.length;
        int maxSum = 0;
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += arr[i];
            if(sum > maxSum){
                maxSum =  sum;
            }
            if(sum <0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
