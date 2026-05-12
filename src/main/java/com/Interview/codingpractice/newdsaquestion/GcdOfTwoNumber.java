package com.Interview.codingpractice.newdsaquestion;

public class GcdOfTwoNumber {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 18;
//        int gcd = 1;
//
//        while (b != 0){
//            int temp = b;
//            b = a%b;
//            a = temp;
//        }
//        System.out.println(a);
        int a = 12;
        int b = 18;
        int gcd = 1;
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a);
    }
}
