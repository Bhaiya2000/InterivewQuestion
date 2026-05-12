package com.Interview.codingpractice.array;

public class RotateArrayKTimesTowardsLeft {
//    public static int[] reverseArray(int arr[], int start, int end){
//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        return arr;
//    }
    public static void main(String[] args) {
//        int arr[] = {5,1,2,3,4};
//        int n  = arr.length;
//        int k = 2;
//        k = k%n;
//        reverseArray(arr,0,k-1);
//        reverseArray(arr,k,n-1);
//        reverseArray(arr,0,n-1);
//        for(int i =0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

        int A[] = {1,2,3,4,5,6,7};
        int n = A.length;
        int b = 2;
        b = b%n;
        int i=0;
        int j = b-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        i = b;
        j = n-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = n-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        for(i =0; i<n; i++ ){
            System.out.print(A[i]+" ");
        }
    }
}
