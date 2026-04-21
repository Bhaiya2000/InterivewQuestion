package com.Interview.codingpractice.newdsaquestion;

public class BubbleSortArray {
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,1,-2,8};
        int n = arr.length;
        for(int i =0; i<arr.length; i++){
            for(int j =0; j< arr.length-1-i; j++){
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
