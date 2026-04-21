package com.Interview.codingpractice.array.rivisionarray2;

public class MaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,6,5,8};
        int n = arr.length;
        int maxElement = 0;
        for(int i =0; i<n; i++){
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
    }
}
