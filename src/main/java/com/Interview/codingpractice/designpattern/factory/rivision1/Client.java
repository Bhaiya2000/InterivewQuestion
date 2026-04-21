package com.Interview.codingpractice.designpattern.factory.rivision1;



public class Client {
    public static void main(String[] args) {

        Employee employee =  EmployeeFactory.getEmployee("Java Developer");
        Employee employee1 =  EmployeeFactory.getEmployee("Andriod Developer");
//         Employee employee2 =  EmployeeFactory.getEmployee("MainFrame Developer");

        System.out.println(employee.getSalary());
        System.out.println(employee1.getSalary());
//        System.out.println(employee2.getSalary());

    }
}
