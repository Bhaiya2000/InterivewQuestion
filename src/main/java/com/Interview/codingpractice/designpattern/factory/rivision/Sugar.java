package com.Interview.codingpractice.designpattern.factory.rivision;

public class Sugar implements Grocerry{
    @Override
    public int getPrice() {
        System.out.print("This is sugar price ");
        return 42;
    }
}
