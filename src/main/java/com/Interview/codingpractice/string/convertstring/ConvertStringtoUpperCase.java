package com.Interview.codingpractice.string.convertstring;

import java.util.Scanner;

public class ConvertStringtoUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // 1st way of converting the lower case string to upper case string
        System.out.println(s.toUpperCase());

        // 2nd way of converting the upper case string to lower case string
        char [] a = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            if(a[i] >= 'a' && a[i] <= 'z'){
                a[i] = (char)(a[i] - 32);
            }
        }
        System.out.println(a);
    }
}
