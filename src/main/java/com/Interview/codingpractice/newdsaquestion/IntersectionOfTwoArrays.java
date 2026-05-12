package com.Interview.codingpractice.newdsaquestion;

import java.util.ArrayList;
import java.util.Arrays;

// Intersection means when the same element is available in both the array
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,8};
//        int n = arr.length;
//        int arr1[] = {9,1,4,8};
//        int m = arr1.length;
//        ArrayList<Integer> list  =  new ArrayList<>();
//        for(int i =0; i<n; i++){
//            for(int j =0; j<m; j++){
//                if(arr[i] == arr1[j]){
//                    list.add(arr1[j]);
//                }
//            }
//        }
//        System.out.println(list);
        int arr[] = {1,4,3,2,5,6,7,8};
        int n = arr.length;
        int arr1[] = {2,3,4,1,3,4,6,7};
        int m  = arr1.length;
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(arr[i] == arr[j]){
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
