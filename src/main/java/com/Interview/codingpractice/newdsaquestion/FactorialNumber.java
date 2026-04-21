package com.Interview.codingpractice.newdsaquestion;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        for(int i =1; i<=n; i++){
            factorial = factorial *i;
        }
        System.out.println(factorial);
    }
}
