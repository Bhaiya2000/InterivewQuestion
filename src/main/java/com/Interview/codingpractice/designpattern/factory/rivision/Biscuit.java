package com.Interview.codingpractice.designpattern.factory.rivision;

public class Biscuit implements Grocerry{
    @Override
    public int getPrice() {
        System.out.print("This is biscuit price ");
        return 10;
    }
}
