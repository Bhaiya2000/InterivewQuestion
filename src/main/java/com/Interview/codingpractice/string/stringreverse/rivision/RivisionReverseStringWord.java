package com.Interview.codingpractice.string.stringreverse.rivision;

import java.util.Scanner;

public class RivisionReverseStringWord {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringBuilder =  new StringBuilder();
        int i =0;
        int n = str.length();
        while(i<n){
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
            while(i<n && str.charAt(i) != ' '){
                i++;
            }

            if(i<n){
                stringBuilder.append(' ');
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
