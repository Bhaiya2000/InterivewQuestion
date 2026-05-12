package com.Interview.codingpractice.newdsaquestion;

import java.util.HashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,5,4,3};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i =0; i<arr.length; i++){
//            set.add(arr[i]);
//        }
//        for(int num : set){
//            System.out.print(num+" ");
//        }

        int arr[] = {1,4,2,3,5,6,7,8,9,6,5,4,3};
        int n  = arr.length;
        HashSet<Integer> set  =  new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(arr[i]);
        }

        for(int num : set){
            System.out.print(num+" ");
        }
    }
}
