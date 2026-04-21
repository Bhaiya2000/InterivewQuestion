package com.Interview.codingpractice.techbullsrivision.array;

public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int b = 8;
        boolean flag  = false;
        for(int i =0; i<n; i++){
            if(arr[i] == b) {
               flag = true;
            }
        }

        if(flag == true){
            System.out.println("Element found in the array");
        }
        else{
            System.out.println("Element is not found");
        }
    }
}
