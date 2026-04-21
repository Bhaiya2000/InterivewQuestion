package com.Interview.codingpractice.output;

public class PassByValue2 {
    int value = 10;

    public static void main(String[] args) {
        PassByValue t = new PassByValue();
        modify1(t);
        System.out.println(t.value);
        System.out.println(t.value);
    }
    static void modify1(PassByValue t) {
        t = new PassByValue();
        t.value = 50;
    }
}
