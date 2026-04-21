package com.Interview.codingpractice.java8stream.employee.rivision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeWithSecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,200,"Aman","Developer"),
                new Employee(2,3200,"Anand","developer"),
                new Employee(4,400,"Akash","Finance"),
                new Employee(6,4000,"Anshu","Testing"),
                new Employee(9,6000,"Rohit","Sales"),
                new Employee(5,400,"Rohan","Finance"),
                new Employee(8,9000,"Deepak","Testing"),
                new Employee(7,5000,"Karan","Sales")
        );

        Integer secondHighestSalary =  employeeList.stream().map(i-> i.getSalary()).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestSalary);
    }
}
