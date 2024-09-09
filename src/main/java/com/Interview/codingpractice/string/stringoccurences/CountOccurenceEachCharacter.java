package com.Interview.codingpractice.string.stringoccurences;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurenceEachCharacter {
    public static void main(String[] args) {

         // Find the occurence of each character of String
//        String str = "anand";
//        HashMap<Character, Integer> map =  new HashMap<>();

        // first way
//        for(int i =0; i<str.length(); i++)
//        {
//            if(map.containsKey(str.charAt(i))){
//                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//            }
//            else{
//                map.put(str.charAt(i), 1);
//            }
//        }
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.print(entry.getKey() + "" + entry.getValue()+" ");
//        }

//        for(int i =0; i<str.length(); i++)
//        {
//            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
//        }
//
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//            System.out.print(entry.getKey()+""+entry.getValue()+" ");
//        }

        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + "" + entry.getValue()+" ");
        }
    }
}
