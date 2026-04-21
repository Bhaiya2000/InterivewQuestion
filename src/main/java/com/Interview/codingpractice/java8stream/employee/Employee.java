package com.Interview.codingpractice.java8stream.employee;

public class Employee {

    private int id;
    private int salary;
    private String name;
    private String department;

    public Employee(int salary, String name, String department){
        this.salary = salary;
        this.name = name;
        this.department = department;
    }


    public Employee(int id, int salary, String name, String department){
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.id = id;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return  name;
    }

    public String getDepartment(){
        return  department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}
