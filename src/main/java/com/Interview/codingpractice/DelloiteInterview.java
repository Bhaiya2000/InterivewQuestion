package com.Interview.codingpractice;

import java.util.Scanner;

public class DelloiteInterview {
    public static void main(String[] args) {
//        System.out.println("abc");

//        String s = "abc";
        String s1 = "abc";


        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        int sanitizeCount = 0;
        int capitalCount = 0;
        int alphaNumericCount = 0;
        int palindromicCount = 0;

        StringBuilder sanitized =  new StringBuilder();
        int n =  str.length();
        for(int i =0; i<n; i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'
                    || ch >= 'a' && ch <= 'z'
                    || ch >= '0' && ch <= '9'
               ){
                sanitizeCount++;
                sanitized.append(sanitizeCount);
            }
            else if (ch == ' '){
              sanitized.append(ch);
            }
        }

        String s = sanitized.toString();
        String [] arr = s.split(" ");
        for(String character : arr){
            if(character.length() == 0){
                continue;
            }
            alphaNumericCount++;
            int left  = 0;
            int right = arr.length-1;
            boolean isPalindrome = true;
            while(left < right){
                if(character.charAt(left) !=  character.charAt(right)){
                    isPalindrome =  false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome){
                palindromicCount++;
            }
        }
        System.out.println(s);
        System.out.println(capitalCount);
        System.out.println(alphaNumericCount);
        System.out.println(palindromicCount);
    }
}

//Input
//
//        Developed;;; and maintained```1 a data ingestion pipeline using Spring Boot, integrating data from multiple
//
//enterprise applications into a centralized backend system.
//
//Implemented data aggregation!!!! and transformation logic at category, sector, and year-month levels,
//
//ensuring accuracy's and consistency in reporting and analytics-use...
//
//Designed and scheduled Cron Jobs to automate data processing and dumping into the SQL database for
//
//downstream use.!!
//
//Ensured high-quality
//
//
//
//Output:
//
//
//
//Sanitize and its No of words
//
//No of Capital letter
//
//No of alphanumeric
//
//no of palindrome
