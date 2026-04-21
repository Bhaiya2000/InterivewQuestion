package com.Interview.codingpractice.techbullsrivision.string;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "anandshukla";
        int n = s.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i =0; i<n ;i++){
            if(map.get(s.charAt(i)) == 1){
                System.out.println("First non repeating character of string "+s.charAt(i));
                break;
            }
        }


    }
}
