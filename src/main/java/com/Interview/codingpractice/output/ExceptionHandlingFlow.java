package com.Interview.codingpractice.output;

public class ExceptionHandlingFlow {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }
}
