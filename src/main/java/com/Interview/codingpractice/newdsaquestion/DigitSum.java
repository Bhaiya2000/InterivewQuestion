package com.Interview.codingpractice.newdsaquestion;

public class DigitSum {
    public static void main(String[] args) {
        int a = 2341;
        int sum = 0;
        while(a>0){
            int b = a%10;
            sum =  sum + b;
            a = a/10;

        }
        System.out.println(sum);
    }
}
