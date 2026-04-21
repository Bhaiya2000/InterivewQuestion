package com.Interview.codingpractice.designpattern.factory.rivision;

public class CheckPrice {
    public static void main(String[] args) {
        Grocerry grocerry =  FactoryGrocerry.getPrice("Sugar");
        Grocerry grocerry1 =  FactoryGrocerry.getPrice("Biscuit");
        System.out.println(grocerry.getPrice());
        System.out.println(grocerry1.getPrice());
    }
}
