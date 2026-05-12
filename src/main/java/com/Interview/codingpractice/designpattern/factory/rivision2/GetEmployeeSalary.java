package com.Interview.codingpractice.designpattern.factory.rivision2;

public class GetEmployeeSalary {
    public static void main(String[] args) {

      Employee javaDeveloper =  EmployeeFactory.getEmployee("Java Developer");
      System.out.println("Java Developer Salary is "+javaDeveloper.getSalary());

      Employee frontendDeveloper =  EmployeeFactory.getEmployee("Front-end Developer");
      System.out.println("Front-End Developer Salary is "+frontendDeveloper.getSalary());

      Employee androidDeveloper  = EmployeeFactory.getEmployee("Android Developer");
      System.out.println("Android Developer Salary is "+androidDeveloper.getSalary());

      Employee salesForceDeveloper = EmployeeFactory.getEmployee("SalesForce Developer");
      System.out.println("SalesForce Developer Salary is "+salesForceDeveloper.getSalary());

      Employee automationTester = EmployeeFactory.getEmployee("Automation Tester");
      System.out.println("Automation Tester Salary is "+automationTester.getSalary());
    }
}
