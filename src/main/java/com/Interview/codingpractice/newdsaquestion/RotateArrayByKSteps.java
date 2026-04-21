package com.Interview.codingpractice.newdsaquestion;

public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n  = arr.length;
        int k = 2;
        int i = 0;
        int j =  n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        k = k%n;
        i = 0;
        j = k;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = k;
        j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
