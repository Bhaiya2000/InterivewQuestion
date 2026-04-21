package com.Interview.codingpractice.techbullsrivision.array;

import java.util.HashMap;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 4, 5};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = arr[0];
        map.put(sum,0);
        boolean flag = false;
        for(int i =0; i<n; i++){
            sum = sum + arr[i];
            if(map.containsKey(sum)){
                flag = true;
            }
            else{
                map.put(sum,0);
            }
        }
        if(flag == true){
            System.out.println("SubArray with zero sum found");
        }
        else{
            System.out.println("Subarray with zero sum is not found");
        }
    }
}
