package com.Interview.codingpractice.techbullsrivision.basic;

public class DigitSum {
    public static void main(String[] args) {
        int n  = 123;
        int digitSum = 0;
        while(n>0){
            int b = n%10;
            digitSum = digitSum+b;
            n = n/10;
        }
        System.out.println(digitSum);
    }
}
