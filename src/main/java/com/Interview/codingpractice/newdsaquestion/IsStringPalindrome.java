package com.Interview.codingpractice.newdsaquestion;

public class IsStringPalindrome {
    public static void main(String[] args) {
//        String str = "ana";
//        int n = str.length();
//        int left = 0;
//        int right = n-1;
//        boolean isPalindrome  = true;
//        while(left < right){
//            if(str.charAt(left) != str.charAt(right)){
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if(isPalindrome){
//            System.out.println("String is Palindrome");
//        }
//        else{
//            System.out.println("String is not palindrome");
//        }

        String str = "aba";
        int n = str.length();
        int left  = 0;
        int right = n-1;
        boolean isPalindrome  = true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
                left++;
                right--;
        }
        if(isPalindrome == true){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not palindrome");
        }

    }
}
