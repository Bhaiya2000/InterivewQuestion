package com.Interview.codingpractice.output;

public class NullHandlingInMethodOverloading {
    static void show(String s) {
        System.out.println("String");
    }

    static void show(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        show(null);
    }
}
