package com.Interview.codingpractice.string.validanagram;

import java.util.HashMap;

public class CheckIfStringIsPanagramOrNot {
    public static void main(String[] args) {
//        String s = "thequickbrownfoxjumpsoverthelazydog";
        String s = "leetcode";
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        boolean isPanagram = false;
        for(int i=1;i<26;i++){
            char c = (char) ('a'+i);
            if(map.containsKey(c)){
                isPanagram = true;
            }
            else {
                isPanagram = false;
            }
        }

        if(isPanagram){
            System.out.println("panagram");
        }
        else {
            System.out.println("not panagram");
        }
    }
}
