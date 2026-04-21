package com.Interview.codingpractice.techbullsrivision.string;

public class ReverseStringWordByWord {
    public static void main(String[] args) {
        String str = "The Sky is blue ";
        int n  = str.length();
        int i =0;
        StringBuilder stringBuilder =  new StringBuilder();
        while(i<n){
            while (i<n && str.charAt(i) == ' '){
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

        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
