package com.Interview.codingpractice.java8stream.employee.rivision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RivisionGroupEmployeeBySalary {
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

//        Map<Integer,List<Employee>> employeeMap =  employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary));
//
//        employeeMap.forEach((salary,employee) -> {
//            System.out.println("Salary "+salary);
//
//            employee.forEach(i->{
//                System.out.println(i.getId()+" "+i.getName()+" "+i.getSalary()+" "+i.getDepartment());
//            });
//        });

        Map<Integer,List<Employee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        map.forEach((salary, employee) ->{
            System.out.println("Salary is "+salary);

            employee.forEach(i->{
                System.out.println(i.getId()+" "+i.getName()+" "+i.getDepartment());
            });
        });
    }
}
