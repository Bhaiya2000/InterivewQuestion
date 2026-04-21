package com.Interview.codingpractice.string.stringoccurences.rivision;

import java.util.HashSet;

public class RivisionFirstLetterAppearTwice {
    public static void main(String[] args) {
        String str = "annand";
        HashSet<Character> set =  new HashSet<>();
        Character ans = str.charAt(0);
        for(int i =1; i<str.length(); i++){
            set.add(str.charAt(i-1));
            if(set.contains(str.charAt(i))){
                ans  = str.charAt(i);
                break;
            }
        }
        System.out.println(ans);
    }
}
