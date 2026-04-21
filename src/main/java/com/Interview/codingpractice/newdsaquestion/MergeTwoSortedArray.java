package com.Interview.codingpractice.newdsaquestion;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6};
        int arr1[] = {2,5,6,7};

        int n  = arr.length;
        int m  = arr1.length;

        int i =0;
        int j =0;
        int k =0;

        int mergedArray [] = new int [n+m];

        while(i<n && j <m){
            if(arr[i] < arr1[j]){
                mergedArray[k] = arr[i];
                i++;
            }
            else{
                mergedArray[k] = arr1[j];
                j++;
            }
            k++;
        }

        while(i<n){
            mergedArray[k] = arr[i];
            i++;
            k++;
        }

        while(j<m){
            mergedArray[k] = arr1[j];
            j++;
            k++;
        }

        for(int num : mergedArray){
            System.out.print(num +" ");
        }
    }
}
