package com.Interview.codingpractice.subarray;

import java.util.HashMap;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
//        int A[] = {4, -1, 1};
        int A[] = {1, 2, 3, 4, 5};
        int n = A.length;
        int sum = A[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(sum,0);
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            if (map.containsKey(sum)) {
                found = true;
            }
            else{
                map.put(sum,0);
            }
        }
        if (found) {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
