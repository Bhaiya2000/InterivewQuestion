package com.Interview.codingpractice.java8stream.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1000,"anand","it"),
                new Employee(200,"akash","software developer"),
                new Employee(6000,"aman","software tester"),
                new Employee(8000,"anand","it"),
                new Employee(900,"akash","software developer"),
                new Employee(2000,"aman","software tester")
        );
        Map<String,Integer> secondHighestSalaryByDepartment = list.stream().
                collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        i-> i.getValue().stream()
                                .map(Employee::getSalary).distinct().
                                sorted(Comparator.reverseOrder()).skip(0).findFirst().get()
                ));
        System.out.println(secondHighestSalaryByDepartment);
    }
}
