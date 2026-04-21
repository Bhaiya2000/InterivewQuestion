package com.Interview.codingpractice.techbullsrivision.array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,6,7,8,9};
        int maxElement = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
    }
}
