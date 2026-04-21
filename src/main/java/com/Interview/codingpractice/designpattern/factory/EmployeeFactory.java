package com.Interview.codingpractice.designpattern.factory;

public class EmployeeFactory {
    // get the employee
    public static Employee getEmployee(String empType){
         if(empType.trim().equalsIgnoreCase("Android Developer")){
             return  new AndroidDeveloper();
         }
         else if (empType.trim().equalsIgnoreCase("Java Developer")){
             return new JavaDeveloper();
         }
         else {
             return null;
         }
    }
}
