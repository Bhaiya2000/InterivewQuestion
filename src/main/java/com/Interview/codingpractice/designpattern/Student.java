package com.Interview.codingpractice.designpattern;

/**
 * Eager way of Singleton object
 * Eager way means there will be static initialisation of object and since it is static variable so it will initialise at the time of class loading
 * this is not a good way to create object for a big application
 */


public class Student {
    private static Student student = new Student();

    public static Student getStudent(){
        return student;
    }

}
