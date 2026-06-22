package com.Interview.codingpractice.string.calculatelength;

public class RivisionCalculateLengthOfLastWordOfString {
    public static void main(String[] args) {
//        String str = "The SKY is blue  ";
//        int n = str.length();
//        int length = 0;
//        int ans = 0;
//
//        for(int i =0; i<n ; i++){
//            if(str.charAt(i) == ' '){
//                length = 0;
//            }
//            else{
//                length ++;
//                ans  = length;
//            }
//        }
//        System.out.println(ans);
        String str = "The SKY is blue  ";
        int n  = str.length();
        int length = 0;
        int ans = 0;
        for(int i =0; i<n; i++){
            if(str.charAt(i) == ' '){
                length = 0;
            }
            else {
                length ++;
                ans  = length;
            }
        }
        System.out.println(ans);
    }
}
