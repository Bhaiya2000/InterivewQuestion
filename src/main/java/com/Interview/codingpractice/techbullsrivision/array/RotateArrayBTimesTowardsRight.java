package com.Interview.codingpractice.techbullsrivision.array;

public class RotateArrayBTimesTowardsRight {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 7, 8, 9};
        int n = arr.length;
        int k = 2;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = 0;
        j = k-1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = k;
        j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(i =0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
