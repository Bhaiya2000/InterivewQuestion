package com.Interview.codingpractice.stringoccurences;

import java.util.HashSet;
import java.util.Scanner;

public class FirstLetterAppearTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        char ans = s.charAt(0);
        for (int i = 1; i < n; i++) {
            set.add(s.charAt(i-1));
            if(set.contains(s.charAt(i))){
                ans  = s.charAt(i);
                break;
            }
        }
        System.out.println(ans);
        // input - "abccbaacz"
        // output- "c"
    }
}
