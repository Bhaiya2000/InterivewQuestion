package com.Interview.codingpractice.newdsaquestion;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str  = "abcdedabcd";
        HashMap<Character,Integer> map =  new HashMap<>();

        for(int i =0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                int freq = map.get(str.charAt(i));
                if(freq == 1){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
