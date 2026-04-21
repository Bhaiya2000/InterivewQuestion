package com.Interview.codingpractice.string.substring.rivision;

import java.util.HashSet;
import java.util.Scanner;

public class RivisionLongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
      Scanner scanner =  new Scanner(System.in);
      String str = "abcabcrfcbb";
      int n = str.length();
      int right = 0;
      int left  = 0;
      StringBuilder stringBuilder =  new StringBuilder();
      HashSet<Character> set =  new HashSet<>();
      int maxLenght =  0;
      while(right < n){
          if(set.add(str.charAt(right))){
              int length  = right - left + 1;
              if(length > maxLenght){
                  maxLenght = length;
              }
              right++;
          }
          else{
              while ( str.charAt(left) != str.charAt(right) ){
                  set.remove(str.charAt(left));
                  left++;
              }
              set.remove(str.charAt(left));
              left++;
          }
      }
        System.out.println(maxLenght);
    }
}

// abcabcbb
