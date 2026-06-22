package com.Interview.codingpractice.subarray;

public class FindSumOfBConsecutiveElementOfArray {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4};
//        int b = 3;
//        if(arr.length < b){
//            System.out.println("invalid input");
//        }
//        int sum = 0;
//        for(int i =0; i<b; i++){
//            sum = sum+arr[i];
//        }
//        int maxSum = sum;
//        for(int i =b; i<arr.length; i++){
//            sum = sum - arr[i-b] + arr[i];
//            if(sum > maxSum){
//                maxSum = sum;
//            }
//        }
//        System.out.println("The maximum sum of B consecutive element is :" + maxSum);
//

        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int b = 4;
        if(n < 4){
            System.out.println("Invalid input");
        }

        int sum = 0;
        for(int i =0; i<n; i++){
            sum += arr[i];
        }

        int maxSum = sum;
        for(int i = b; i<n; i++){
            sum =  sum - arr[i-b] +arr[i];
            if(sum > maxSum){
                maxSum =  sum;
            }
        }

        System.out.println(maxSum);
    }
}
