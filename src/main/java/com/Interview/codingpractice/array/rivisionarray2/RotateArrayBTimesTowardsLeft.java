package com.Interview.codingpractice.array.rivisionarray2;

public class RotateArrayBTimesTowardsLeft {
    public static int[] reverseArray(int []arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 2;
        int n = arr.length;
        k = k%n;

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
