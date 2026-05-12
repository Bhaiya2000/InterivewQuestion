package com.Interview.codingpractice.designpattern.factory.rivision2;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Java Developer")){
            return  new JavaDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Front-end Developer")) {
            return new FrontendDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Automation Tester")) {
            return new AutomationTesting();
        } else if (empType.trim().equalsIgnoreCase("SalesForce Developer")) {
            return new SalesForceDeveloper();
        }
        else {
            return  null;
        }
    }
}
