package com.Interview.codingpractice.designpattern.factory;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Android developer salary");
        return 500;
    }
}
