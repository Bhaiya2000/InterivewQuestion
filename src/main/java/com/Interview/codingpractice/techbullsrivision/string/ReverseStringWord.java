package com.Interview.codingpractice.techbullsrivision.string;

public class ReverseStringWord {
    public static void main(String[] args) {
        String str = "The Sky is blue";
        int n  = str.length();
        StringBuilder stringBuilder =  new StringBuilder();
        int i = 0;
        while(i<n) {
            while(i<n && str.charAt(i) == ' '){
                i++;
            }

            StringBuilder stringBuilder1 =  new StringBuilder();
            while(i<n && str.charAt(i) != ' '){
                stringBuilder1.append(str.charAt(i));
                i++;
            }
            stringBuilder1.reverse();
            stringBuilder.append(stringBuilder1);

            while(i<n && str.charAt(i) == ' '){
                i++;
            }

            if(i<n){
                stringBuilder.append(' ');
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
