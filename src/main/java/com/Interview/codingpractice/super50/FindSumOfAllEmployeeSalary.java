package com.Interview.codingpractice.super50;

import java.util.Arrays;
import java.util.List;

public class FindSumOfAllEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,200,"java developer","Developer"),
                new Employee(2,50001,"andriod developer","developer"),
                new Employee(4,50000,"Human Resource","Finance"),
                new Employee(6,55000,"QA","Testing"),
                new Employee(9,6000,"Sales Representative","Sales"),
                new Employee(5,400,"Human Resource","Finance"),
                new Employee(8,9000,"QA","Testing"),
                new Employee(7,5000,"Sales Representative","Sales")
        );

        long sumofSalary = employeeList.stream().map(i-> i.getSalary())
                .reduce((a,b) -> a+b).get();
        System.out.println(sumofSalary);
    }
}
