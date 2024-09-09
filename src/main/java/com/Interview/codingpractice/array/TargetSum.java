package com.Interview.codingpractice.array;

import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        int A[] = {2,7,11,15};
        int target = 7;
        HashMap<Integer,Integer> hashMap =  new HashMap<>();
        boolean flag = false;
        for(int i=0; i<A.length; i++){
            int b = target  -  A[i];
            if(hashMap.containsKey(b)){
                flag = true;
                break;
            }
            else{
                if(hashMap.containsKey(A[i]) == false){
                    hashMap.put(A[i],1);
                }
            }
        }
        if(flag == true){
            System.out.println("yes target sum is available");
        }
        else{
            System.out.println("no target sum is available");
        }
    }
}
