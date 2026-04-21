package com.Interview.codingpractice.techbullsrivision.array;

import java.util.HashSet;

public class MissingNumberFromOneToN {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,7,8};
        HashSet<Integer> set =  new HashSet<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }

        for (int a : set){
            System.out.print(a+" ");
        }

        System.out.println();

        int a = 0;
        for(int i =1; i<=n; i++){
            if (set.contains(i)){
                continue;
            }
            else{
                a = i;
            }
        }

        System.out.println(a);
    }
}
