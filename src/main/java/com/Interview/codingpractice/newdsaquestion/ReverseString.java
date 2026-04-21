package com.Interview.codingpractice.newdsaquestion;

public class ReverseString {
    public static void main(String[] args) {
        String str = " anand";
        int n =  str.length();
        String ans  = "";
        for(int i =n-1; i>=0; i--){
            ans  = ans + str.charAt(i);
        }
        System.out.println(ans);
    }
}
