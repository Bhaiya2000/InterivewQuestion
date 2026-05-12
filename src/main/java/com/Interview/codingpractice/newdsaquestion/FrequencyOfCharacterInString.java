package com.Interview.codingpractice.newdsaquestion;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacterInString {
    public static void main(String[] args) {
//        String str = "abcabcbsdtr";
//        int n = str.length();
//        HashMap<Character,Integer> map =  new HashMap<>();
//        for(int i =0; i<n; i++){
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
//        }
//
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
//        }

        String str = "abcrebfghribshfr";
        int n = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue()+" ");
        }
    }
}
