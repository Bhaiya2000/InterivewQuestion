package com.Interview.codingpractice.java8stream.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FindNthHighestSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,200,"anand","it")
                , new Employee(2,2000,"bob","software development")
                , new Employee(3,500,"david","Quality Assurance")
                , new Employee(4,100,"daniel","software development")
                , new Employee(5,4000,"danielhigh","Quality Assurance")
                , new Employee(6,3000,"daniel","Quality Assurance")
                , new Employee(7,10000,"daniel","software development")
                , new Employee(8,20000,"daniel","it")
        );

        Employee employee   = employees.stream().sorted(Comparator.comparingDouble(Employee ::getSalary).reversed())
                .skip(0).findFirst().get();
        System.out.println(employee.getName()+" "+employee.getSalary());
    }
}
