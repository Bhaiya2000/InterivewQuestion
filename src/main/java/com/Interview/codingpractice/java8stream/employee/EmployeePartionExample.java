package com.Interview.codingpractice.java8stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeePartionExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1000,"anand","it"),
                new Employee(200,"akash","software developer"),
                new Employee(6000,"aman","software tester"),
                new Employee(8000,"anand","it"),
                new Employee(900,"akash","software developer"),
                new Employee(2000,"aman","software tester")
        );

        Map<Boolean, List<Employee>> map =  employeeList.stream()
                .collect(Collectors.partitioningBy(i-> i.getSalary() >200));

        map.get(true).forEach(employee -> {
            System.out.println(employee.getName()+" "+employee.getDepartment()+" "+employee.getSalary());
        });


    }
}
