package com.Interview.codingpractice.java8stream.employee;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestSalaryDepartmentByDepartUsingStreamAPI {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,200,"java developer","Developer"),
                new Employee(2,3200,"andriod developer","developer"),
                new Employee(4,400,"Human Resource","Finance"),
                new Employee(6,4000,"QA","Testing"),
                new Employee(9,6000,"Sales Representative","Sales"),
                new Employee(5,400,"Human Resource","Finance"),
                new Employee(8,9000,"QA","Testing"),
                new Employee(7,5000,"Sales Representative","Sales")
        );

        Map<String,Employee> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,
                        emp -> emp,
                        (emp1, emp2) -> emp1.getSalary()  > emp2.getSalary() ? emp1 : emp2
                ));

        employeeMap.forEach((dept,employee) -> {
            System.out.println(employee.getName()+" "+employee.getSalary()+" "+employee.getDepartment());
        });

    }
}
