package com.Interview.codingpractice.output;

public class PassByValue {
    int value = 10;

    public static void main(String[] args) {
        PassByValue t = new PassByValue();
        modify(t);
        modify1(t);
        System.out.println(t.value);
        System.out.println(t.value);
    }

    static void modify(PassByValue t) {
        t.value = 20;
    }

    static void modify1(PassByValue t) {
        t = new PassByValue();
        t.value = 50;
    }
}
