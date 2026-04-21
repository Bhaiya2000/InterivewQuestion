package com.Interview.codingpractice.techbullsrivision.array;

public class SearchMinElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,5,4,3,2,9,0};
        int minElement = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }
        System.out.println(minElement);
    }
}
