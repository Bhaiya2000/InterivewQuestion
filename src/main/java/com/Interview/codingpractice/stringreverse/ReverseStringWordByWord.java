package com.Interview.codingpractice.stringreverse;

import java.util.Scanner;

public class ReverseStringWordByWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = "the sky is blue";
        int n  = s.length();
        StringBuilder stringBuilder =  new StringBuilder();
        int i = 0;
        while(i < n){
            while(i<n && s.charAt(i) == ' ')
            {
                i++;
            }
            StringBuilder stringBuilder1  =  new StringBuilder();
            while(i<n && s.charAt(i) != ' ')
            {
                stringBuilder1.append(s.charAt(i));
                i++;
            }
            stringBuilder1.reverse();
            stringBuilder.append(stringBuilder1);
            while(i<n && s.charAt(i) == ' ')
            {
                i++;
            }
            if(i<n){
                stringBuilder.append(' ');
            }
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
