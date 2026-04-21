package com.Interview.codingpractice.newdsaquestion;

import java.util.HashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,4,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            set.add(arr[i]);
        }
        for(int num : set){
            System.out.print(num+" ");
        }
    }
}
