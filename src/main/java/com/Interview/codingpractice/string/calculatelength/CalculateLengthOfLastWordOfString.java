package com.Interview.codingpractice.string.calculatelength;

public class CalculateLengthOfLastWordOfString {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int n = s.length();
        int length =0;
        int ans =0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == ' '){
                length = 0;
            }
            else{
                length++;
                ans  = length;
            }
        }
        System.out.println(ans);
        // output --> 4
    }
}
