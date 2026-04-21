package com.Interview.codingpractice.techbullsrivision.array;

public class SortArrayUsingBubblesort {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,5,6,7,2,34,4,5};
        int n  = arr.length;
        for(int i =0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
