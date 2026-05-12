package com.Interview.codingpractice.newdsaquestion;

import java.util.HashMap;
import java.util.HashSet;

public class MissingNumberFromOneToN {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,4,6,7,9};
//        HashSet<Integer> set =  new HashSet<>();
//        int n = arr.length;
//        int missingNumber  = 0;
//        for(int i =0; i<n; i++){
//            set.add(arr[i]);
//        }
//
//        for(int i=1; i<=n; i++){
//            if(set.contains(i)){
//                continue;
//            }
//            else{
//                missingNumber = i;
//            }
//        }
//        System.out.println(missingNumber);
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {1,2,3,4,6,5,4,3,8,9};
        int n = arr.length;
        for(int i =0; i<n;i++){
            set.add(arr[i]);
        }
        int missingNumber  = 0;
        for(int i =1; i<n; i++){
            if(set.contains(i)){
                continue;
            }
            else{
                missingNumber = i;
                break;
            }
        }
        System.out.println(missingNumber);
    }
}
