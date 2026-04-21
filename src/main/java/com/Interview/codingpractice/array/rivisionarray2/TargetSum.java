package com.Interview.codingpractice.array.rivisionarray2;

import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int target = 9;
        int n = arr.length;
        HashMap<Integer,Integer> map =  new HashMap<>();
        boolean flag = false;
        for(int i =0; i<n; i++){
            int b =  target - arr[i];
            if(map.containsKey(b)){

                flag =  true;
                break;
            }
            else{
                if(map.containsKey(arr[i]) == false){
                    map.put(arr[i],1);
                }
            }
        }

        if(flag == false){
            System.out.println("Target sum is not available");
        }
        else{
            System.out.println("Target sum is available");
        }
    }
}
