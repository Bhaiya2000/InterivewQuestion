package com.Interview.codingpractice.designpattern.factory.rivision1;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Java Developer")){
            return  new JavaDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Andriod Developer")) {
            return new AndriodDeveloper();
        }
        else{
            return null;
        }
    }
}
