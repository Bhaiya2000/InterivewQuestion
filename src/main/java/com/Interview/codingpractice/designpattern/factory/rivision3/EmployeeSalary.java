package com.Interview.codingpractice.designpattern.factory.rivision3;

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee javaDeveloper = EmployeeFactory.getEmployee("Java Developer");
        System.out.println( "Java Developer Salary is " +javaDeveloper.getSalary());

        Employee frontendDeveloper = EmployeeFactory.getEmployee("Front-end Developer");
        System.out.println( "Frontend Developer Salary is " +frontendDeveloper.getSalary());

        Employee salesForceDeveloper =  EmployeeFactory.getEmployee("SalesForce Developer");
        System.out.println( "Salesforce Developer Salary is " +salesForceDeveloper.getSalary());

        Employee dataScientist = EmployeeFactory.getEmployee("Data Scientist");
        System.out.println( "Data Scientist Salary is " +dataScientist.getSalary());
    }
}
