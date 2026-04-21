package com.Interview.codingpractice.string.stringreverse.rivision;

public class RivisionReverseString {
    public static void main(String[] args) {
        String str = "anandshukla";
        int n  = str.length();
        String ans = "";
        for(int  i = n-1; i>=0; i--){
            ans = ans + str.charAt(i);
        }
        System.out.println(ans);
    }
}
