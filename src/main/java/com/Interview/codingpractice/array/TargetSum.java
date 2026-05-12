package com.Interview.codingpractice.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TargetSum {
    public static void main(String[] args) {
//        int A[] = {2,7,11,15,21};
//        int target = 7;
//        HashMap<Integer,Integer> hashMap =  new HashMap<>();
//        boolean flag = false;
//        for(int i=0; i<A.length; i++){
//            int b = target  -  A[i];
//            if(hashMap.containsKey(b)){
//                flag = true;
//                break;
//            }
//            else{
//                if(hashMap.containsKey(A[i]) == false){
//                    hashMap.put(A[i],1);
//                }
//            }
//        }
//        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        if(flag == true){
//            System.out.println("yes target sum is available");
//        }
//        else{
//            System.out.println("no target sum is available");
//        }

        int A[] = {1,2,3,4,5,6,7,8};
        int target  = 16;
        int n = A.length;
        boolean flag =  false;
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            int b = target - A[i];
            if(map.containsKey(b)){
                flag =  true;
                break;
            }
            else{
                if(map.containsKey(A[i]) == false){
                    map.put(A[i],1);
                }
            }
        }

        if (flag ==  true){
            System.out.println("Target sum is available in the array");
        }
        else{
            System.out.println("Target sum is not available in the array");
        }
    }
}
