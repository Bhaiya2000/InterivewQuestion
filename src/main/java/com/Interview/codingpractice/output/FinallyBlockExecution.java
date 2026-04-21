package com.Interview.codingpractice.output;

public class FinallyBlockExecution {
    public static void main(String[] args) {
                try {
                    System.out.println("Try");
                    return;
                } finally {
                    System.out.println("Finally");
                }
    }
}
