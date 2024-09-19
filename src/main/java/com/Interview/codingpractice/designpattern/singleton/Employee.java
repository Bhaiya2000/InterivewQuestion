package com.Interview.codingpractice.designpattern.singleton;

/**
 * Lazy way of singleton object creation
 * in lazy way the object will create when we call the method
 */
public class Employee {
    public static  Employee employee;

    private Employee(){

    }

    public static Employee getEmployee(){
        if(employee==null){
            employee = new Employee();
        }
        return employee;
    }
}
