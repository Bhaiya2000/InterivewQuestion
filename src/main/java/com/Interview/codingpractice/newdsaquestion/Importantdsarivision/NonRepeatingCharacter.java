package com.Interview.codingpractice.newdsaquestion.Importantdsarivision;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcdeabcdebfgf";
        int n = str.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i =0; i<n; i++){
            if(map.containsKey(str.charAt(i))){
                int freq = map.get(str.charAt(i));
                if(freq == 1){
                    System.out.println("This is the first non repeating character "+str.charAt(i));
                    break;
                }
            }
        }
    }
}
