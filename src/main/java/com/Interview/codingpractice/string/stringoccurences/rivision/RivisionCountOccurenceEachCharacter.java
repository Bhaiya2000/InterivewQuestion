package com.Interview.codingpractice.string.stringoccurences.rivision;

import java.util.HashMap;
import java.util.Map;

public class RivisionCountOccurenceEachCharacter {
    public static void main(String[] args) {
        String str = "anandshukla";
        HashMap<Character, Integer> map =  new HashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+""+ entry.getValue()+" ");
        }

    }
}
