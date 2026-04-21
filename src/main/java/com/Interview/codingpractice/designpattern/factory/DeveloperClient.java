package com.Interview.codingpractice.designpattern.factory;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("Java Developer");
        System.out.println(employee.getSalary());

        Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee1.getSalary());

        employee = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(employee.getSalary());


    }
}
