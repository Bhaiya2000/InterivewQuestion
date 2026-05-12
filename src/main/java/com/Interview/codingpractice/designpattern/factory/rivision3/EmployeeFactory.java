package com.Interview.codingpractice.designpattern.factory.rivision3;

public class EmployeeFactory {

    public static Employee getEmployee(String emptype){
        if(emptype.trim().equalsIgnoreCase("Java Developer")){
            return new JavaDeveloper();
        } else if (emptype.trim().equalsIgnoreCase("Front-end Developer")) {
            return new FrontendDeveloper();
        } else if (emptype.trim().equalsIgnoreCase("SalesForce Developer")) {
            return new SalesForceDeveloper();
        } else if (emptype.trim().equalsIgnoreCase("Data Scientist")) {
            return new DataScientist();
        }else {
            return null;
        }
    }
}
