package com.Interview.codingpractice.java8stream.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1000,"anand","it"),
                new Employee(200,"akash","software developer"),
                new Employee(6000,"aman","software tester"),
                new Employee(8000,"anand","it"),
                new Employee(900,"akash","software developer"),
                new Employee(2000,"aman","software tester")
        );

        Integer secondHighestSalry = employeeList.stream().map(Employee::getSalary)
                .distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestSalry);
    }
}
