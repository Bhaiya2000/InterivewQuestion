package com.Interview.codingpractice.techbullsrivision.string;

public class CalculateLengthOfLastWordOfString {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        int n = str.length();
        int  length = 0;
        int ans = 0;

        for(int i =0; i<n; i++){
            if(str.charAt(i) == ' '){
                length = 0;
            }
            else{
                length++;
                ans  = length;
            }
        }
        System.out.println("Length of last word of string is :" + ans);
    }
}
