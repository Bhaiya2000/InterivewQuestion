package com.Interview.codingpractice.output;

public class StaticVsInstance {
    static int x = 10;
    public static void main(String[] args) {
        StaticVsInstance t1 = new StaticVsInstance();
        StaticVsInstance t2 = new StaticVsInstance();
        t1.x = 20;
        System.out.println(t2.x);
    }
}
