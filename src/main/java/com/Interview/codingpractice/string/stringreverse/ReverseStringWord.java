package com.Interview.codingpractice.string.stringreverse;

public class ReverseStringWord {
    public static void main(String[] args) {
        String s = "  hello world  ";
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<n){
            while(i<n && s.charAt(i) == ' '){
                i++;
            }
            StringBuilder sb2 = new StringBuilder();
            while(i<n && s.charAt(i) != ' '){
                sb2.append(s.charAt(i));
                i++;
            }
            sb2.reverse();
            sb.append(sb2);
            while(i<n && s.charAt(i) == ' '){
                i++;
            }
            if(i<n){
                sb.append(' ');
            }
        }
        System.out.print(sb.toString());
    }
}
