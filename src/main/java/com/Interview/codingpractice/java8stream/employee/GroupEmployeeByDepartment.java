package com.Interview.codingpractice.java8stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1000,"anand","it"),
                new Employee(200,"akash","software developer"),
                new Employee(6000,"aman","software tester"),
                new Employee(8000,"anand","it"),
                new Employee(900,"akash","software developer"),
                new Employee(2000,"aman","software tester")
        );

        Map<String,List<Employee>> employeeMap = employeeList.stream().
                collect(Collectors.groupingBy(Employee :: getDepartment));

        employeeMap.forEach((department,employee) ->{
            System.out.println("department " + department);

            employee.forEach(i->{
                System.out.println(i.getName()+" "+i.getSalary());
            });
        });
    }
}


// Grouping by department
