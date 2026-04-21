package com.Interview.codingpractice.java8stream.employee.rivision;

public class Employee {

    private int id;
    private int salary;
    private String name;
    private String department;


    public Employee(int id, int salary, String name, String deparment){
        this.name = name;
        this.id = id;
        this.salary =  salary;
        this.department = deparment;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(int salary){
        this.salary =  salary;
    }

    public void setName(String name){
        this.name =  name;
    }

    public void setDepartment(String department){
        this.department =  department;
    }

}
