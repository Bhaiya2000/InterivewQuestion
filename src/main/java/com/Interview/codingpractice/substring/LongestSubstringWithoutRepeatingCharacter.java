package com.Interview.codingpractice.substring;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         String s = sc.nextLine();
////         String  s = "abcabcbb";  // output = 3
//         int n  = s.length();
//         int right = 0;
//         int left = 0;
//        HashSet<Character> hashSet =  new HashSet<>();
//        int max_Length = Integer.MIN_VALUE;
//        while(right < n){
//            if(hashSet.add(s.charAt(right))){
//                int length =  right - left +1;
//                if(length > max_Length){
//                    max_Length = length;
//                }
//                right++;
//            }
//            else{
//                while(s.charAt(left) !=  s.charAt(right)){
//                    hashSet.remove(s.charAt(left));
//                    left++;
//                }
//                hashSet.remove(s.charAt(left));
//                left++;
//            }
//        }
//        System.out.println(max_Length);

        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int right =0;
        int left =0;
        int max_Length = Integer.MIN_VALUE;
       while (right < n) {
           if(set.add(s.charAt(right))){
               int length = right - left +1;
               if(length > max_Length){
                   max_Length = length;
               }
               right++;
           }
           else{
               while(s.charAt(left) != s.charAt(right)){
                   set.remove(s.charAt(left));
                   left++;
               }
               set.remove(s.charAt(left));
               left++;
           }
       }
       System.out.println(max_Length);
    }
}
