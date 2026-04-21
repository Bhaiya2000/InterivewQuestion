package com.Interview.codingpractice.techbullsrivision.array;

public class FindSumOfBConsecutiveElementOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int b = 4;
        int n  = arr.length;
        int sum =0;
        for(int i =0; i<b; i++){
            sum =  sum + arr[i];
        }

        int maxBConsecutiveSum = sum ;

        for(int i =b; i<arr.length; i++){

            sum =  sum - arr[i-b]+ arr[i];

            if(maxBConsecutiveSum < sum ){
                maxBConsecutiveSum =  sum;
            }
        }

        System.out.println(maxBConsecutiveSum);
    }
}
