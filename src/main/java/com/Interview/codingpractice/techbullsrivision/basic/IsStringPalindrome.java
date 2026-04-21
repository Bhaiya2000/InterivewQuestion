package com.Interview.codingpractice.techbullsrivision.basic;

public class IsStringPalindrome {
    public static void main(String[] args) {
        String ans  = "abab";
        int n = ans.length();
        int left = 0;
        int right = n-1;
        boolean flag = true;
        while(left < right){
            if(ans.charAt(left) != ans.charAt(right)){
                flag = false;
                break;
            }
            left ++;
            right--;
        }

        if(flag == true){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
