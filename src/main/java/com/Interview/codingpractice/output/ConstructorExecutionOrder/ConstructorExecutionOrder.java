package com.Interview.codingpractice.output.ConstructorExecutionOrder;

public class ConstructorExecutionOrder extends A{
    ConstructorExecutionOrder() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new ConstructorExecutionOrder();
    }
}
