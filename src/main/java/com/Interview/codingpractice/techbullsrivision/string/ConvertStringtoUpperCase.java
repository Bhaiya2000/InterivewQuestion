package com.Interview.codingpractice.techbullsrivision.string;

public class ConvertStringtoUpperCase {
    public static void main(String[] args) {
        String ans  = "anandshukla";
        char [] arr = ans.toCharArray();

        for(int i =0; i<ans.length(); i++){
            arr[i] = (char) (arr[i] - 32);
        }

        System.out.println(arr);
    }
}
