package com.Interview.codingpractice.techbullsrivision.string;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int n = str.length();
        HashSet<Character> set =  new HashSet<>();
        int right = 0;
        int left = 0;
        int maxLength = 0;
        while(right<n){
            if(set.add(str.charAt(right))){
                int length = right - left + 1;
                if(length > maxLength){
                    maxLength = length;
                }
                right++;
            }
            else
            {
                while(str.charAt(left) != str.charAt(right)){
                    set.remove(str.charAt(left));
                    left++;
                }
                set.remove(str.charAt(left));
                left++;
            }
        }
        System.out.println(maxLength);
    }
}
