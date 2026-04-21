package com.Interview.codingpractice.array.rivisionarray;

import java.util.HashMap;
import java.util.Map;

public class RivisionTwoSumProblem {
    public static void main(String[] args) {
        int arr[] = {1,7,8,2,11,6,3};
        int target  = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag  = false;
        for(int i =0; i<arr.length; i++){
            int b = target - arr[i];
            if(map.containsKey(b)){
                flag = true;
                break;
            }
            else{
                if(map.containsKey(arr[i]) == false){
                    map.put(arr[i],1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        if(flag == false){
            System.out.println("Two sum value is not available");
        }
        else{
            System.out.println("Two sum value is available");
        }
    }
}
