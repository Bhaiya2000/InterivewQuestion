package com.Interview.codingpractice.java8stream.employee.rivision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RivisionGroupEmployeeByDepartment {
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
//
//        Map<String,List<Employee>> employeeMap =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//
//        employeeMap.forEach((department,employeeMap1) ->{
//            System.out.println("Department "+department);
//
//            employeeMap1.forEach(i->{
//                System.out.println(i.getId()+" "+i.getName()+" "+i.getSalary()+" "+i.getDepartment());
//            });
//        });

        Map<String,List<Employee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        map.forEach((department, employee) ->{
            System.out.println("Department"+department);

            employee.forEach(i->{
                System.out.println(i.getId()+" "+i.getName()+" "+i.getSalary());
            });
        });
    }
}
