package com.Interview.codingpractice.subarray.rivision;

import java.util.HashMap;

public class RivisionSubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        HashMap<Integer,Integer> map =  new HashMap<>();
        int n = arr.length;
        int sum = arr[0];
        map.put(sum,0);
        boolean flag =  false;
        for(int i =0; i<n; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                flag = true;
            }
            else{
                map.put(sum,0);
            }
        }
        if(flag == true){
            System.out.println("Sub array with zero sum is available");
        }
        else{
            System.out.println("Sub array with zero sum is not available");
        }
    }
}
