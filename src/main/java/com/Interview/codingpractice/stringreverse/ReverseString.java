package com.Interview.codingpractice.stringreverse;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String ans ="";
        for(int i=n-1; i>=0; i--) {
            ans  =  ans + s.charAt(i);
        }
        System.out.println(ans);
    }
}
