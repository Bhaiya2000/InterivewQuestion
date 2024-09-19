package com.Interview.codingpractice.designpattern.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Employee employee = Employee.getEmployee();
        System.out.println(employee.hashCode());

        Employee employee2 = Employee.getEmployee();
        System.out.println(employee2.hashCode());

        if(employee == employee2){
            System.out.println("Employee is the same");
        }

        if(employee.equals(employee2)){
            System.out.println("Employee is the same");
        }


        Student student = Student.getStudent();
        System.out.println(student.hashCode());

        Student student2 = Student.getStudent();
        System.out.println(student2.hashCode());

        if(student == student2){
            System.out.println("Student is the same");
        }

        DoubleCheckSingletonDesign doubleCheckSingletonDesign =
                DoubleCheckSingletonDesign.getDoubleCheckSingletonDesign();

        System.out.println(doubleCheckSingletonDesign.hashCode());

        DoubleCheckSingletonDesign doubleCheckSingletonDesign2 =
                DoubleCheckSingletonDesign.getDoubleCheckSingletonDesign();

        System.out.println(doubleCheckSingletonDesign2.hashCode());


    }
}
