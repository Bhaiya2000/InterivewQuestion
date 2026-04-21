package com.Interview.codingpractice.output;

public class MethodOverloadingVsTypePromotion {
    static void show(int a) {
        System.out.println("int");
    }

    static void show(double a) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        show(10);
    }
}
