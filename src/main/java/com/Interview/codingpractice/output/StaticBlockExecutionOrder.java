package com.Interview.codingpractice.output;

public class StaticBlockExecutionOrder {
    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
