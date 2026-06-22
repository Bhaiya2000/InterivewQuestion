package com.Interview.codingpractice.string.substring;

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
//
//        Scanner sc = new Scanner(System.in);
//        String s  = sc.nextLine();
//        HashSet<Character> set = new HashSet<>();
//        int n = s.length();
//        int right =0;
//        int left =0;
//        int max_Length = Integer.MIN_VALUE;
//       while (right < n) {
//           if(set.add(s.charAt(right))){
//               int length = right - left +1;
//               if(length > max_Length){
//                   max_Length = length;
//               }
//               right++;
//           }
//           else{
//               while(s.charAt(left) != s.charAt(right)){
//                   set.remove(s.charAt(left));
//                   left++;
//               }
//               set.remove(s.charAt(left));
//               left++;
//           }
//       }
//       System.out.println(max_Length);
//        String str = "abcdabcdnedfgki";
//        int n  = str.length();
//        int left  = 0;
//        int right = 0;
//        HashSet<Character> set = new HashSet<>();
//        int maxLength = 0;
//        while(right < n){
//            if(set.add(str.charAt(right))){
//                int length = right - left  + 1;
//                if(length > maxLength){
//                    maxLength =  length;
//                }
//                right++;
//            }
//            else{
//                while(str.charAt(left) != str.charAt(right)){
//                    set.remove(str.charAt(left));
//                    left++;
//                }
//                set.remove(str.charAt(left));
//                left++;
//            }
//        }
//        System.out.println(maxLength);

        String str = "abcdabcdnedfgki";
        int n  = str.length();
        int left = 0;
        int right = 0;
        int maxLenght = 0;
        HashSet<Character> set  =  new HashSet<>();
        while(right < n){
            if(set.add(str.charAt(right))){
                int length = right - left + 1;
                if(length > maxLenght){
                    maxLenght =  length;
                }
                right++;
            }
            else{
                while(str.charAt(left) != str.charAt(right)){
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
