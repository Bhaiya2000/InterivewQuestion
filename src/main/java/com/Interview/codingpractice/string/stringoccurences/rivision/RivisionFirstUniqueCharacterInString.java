package com.Interview.codingpractice.string.stringoccurences.rivision;

import java.util.HashMap;

public class RivisionFirstUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "ananddi";
        int n = str.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        Character ch ;
        for(int i=0; i<n; i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
