package com.Interview.codingpractice.techbullsrivision.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceEachCharacter {
    public static void main(String[] args) {
        String str = "abcderfbabcdbr";
        int n = str.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
        }
    }
}
