package com.Interview.codingpractice.convertstring;

import java.util.Scanner;

public class ConvertStringtoLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       char[] a = s.toCharArray();


        // 1 one way of converting the upper case string to lower case
       // System.out.println(s.toLowerCase());


        // 2nd way of converting the lower case string to upper case
        for(int i=0; i<a.length; i++){
            if(a[i] >= 'A' && a[i] <= 'Z'){
                a[i] = (char) (a[i] + 32);
            }
        }
        System.out.println(a);
    }
}
