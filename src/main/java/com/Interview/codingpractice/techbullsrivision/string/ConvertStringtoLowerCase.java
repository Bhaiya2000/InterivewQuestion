package com.Interview.codingpractice.techbullsrivision.string;

public class ConvertStringtoLowerCase {
    public static void main(String[] args) {
        String ans  = "AnandShukla";
        char [] arr = ans.toCharArray();

        for(int i =0; i<arr.length; i++ ){
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char) (arr[i] + 32);
            }
        }
        System.out.println(arr);
    }
}
