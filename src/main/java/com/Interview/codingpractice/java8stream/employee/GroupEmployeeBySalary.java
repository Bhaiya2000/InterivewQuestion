package com.Interview.codingpractice.java8stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1000,"anand","it"),
                new Employee(200,"akash","software developer"),
                new Employee(6000,"aman","software tester"),
                new Employee(8000,"anand","it"),
                new Employee(900,"akash","software developer"),
                new Employee(2000,"aman","software tester")
        );

        Map<Integer,List<Employee>>  integerListMap = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));

        integerListMap.forEach((salary,map) ->{
            System.out.println("Salary " + salary);

            map.forEach(i-> {
                System.out.println(i.getName()+" "+i.getDepartment());
            });
        });
    }
}
