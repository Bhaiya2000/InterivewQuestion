package com.Interview.codingpractice.techbullsrivision.array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,6,5,4,3,1};
        int n = arr.length;
        int i =0;
        int j =n-1;
        while(i<j){
            int temp = arr[i] ;
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k =0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
