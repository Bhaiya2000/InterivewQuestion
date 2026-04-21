package com.Interview.codingpractice.designpattern.factory;

public class JavaDeveloper  implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Java Developer Salary");
        return 1000;
    }
}



