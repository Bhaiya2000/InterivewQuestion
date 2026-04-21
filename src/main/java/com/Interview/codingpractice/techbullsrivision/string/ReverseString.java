package com.Interview.codingpractice.techbullsrivision.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "anand";
        String ans = "";
        int n  = str.length();
        for(int i =n-1; i>=0; i-- ){
            ans = ans + str.charAt(i);
        }

        System.out.println(ans);
    }
}
