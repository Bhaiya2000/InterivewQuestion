package com.Interview.codingpractice.techbullsrivision.array;

import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15,21};
        int target = 9;
        int n = arr.length;

        HashMap<Integer,Integer> map =  new HashMap<>();
        boolean flag = false;
        for(int i=0; i<n; i++){
            int b = target - arr[i];
            if(map.containsKey(b)){
                flag = true;
            }
            else{
                if(map.containsKey(arr[i]) == false){
                    map.put(arr[i],1);
                }
            }
        }
        if(flag == false){
            System.out.println("Target sum is not available in the given array");
        }
        else{
            System.out.println("Target sum is available in the given array");
        }
    }
}
