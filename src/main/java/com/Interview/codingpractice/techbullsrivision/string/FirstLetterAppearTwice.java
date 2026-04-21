package com.Interview.codingpractice.techbullsrivision.string;

import java.util.HashMap;

public class FirstLetterAppearTwice {
    public static void main(String[] args) {
        String str = "abcdebabc";
        int n = str.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i =0; i<n; i++){
            if(map.get(str.charAt(i)) == 2){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
