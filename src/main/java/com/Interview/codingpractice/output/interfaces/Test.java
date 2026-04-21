package com.Interview.codingpractice.output.interfaces;

public class Test implements A,B{
    public void show() {
        B.super.show();
    }

    public static void main(String[] args) {
        new Test().show();
    }
}
