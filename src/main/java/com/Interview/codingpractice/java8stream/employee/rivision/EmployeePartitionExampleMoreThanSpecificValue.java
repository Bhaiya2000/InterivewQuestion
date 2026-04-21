package com.Interview.codingpractice.java8stream.employee.rivision;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeePartitionExampleMoreThanSpecificValue {
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

        Map<Boolean, List<Employee>> employeeMap = employeeList
                .stream().collect(Collectors.partitioningBy(i -> i.getSalary()>400));

        employeeMap.get(true).forEach(i->{
            System.out.println(i.getId() + " " +i.getName()+" "+i.getSalary()+" "+i.getDepartment());
        });

    }
}
