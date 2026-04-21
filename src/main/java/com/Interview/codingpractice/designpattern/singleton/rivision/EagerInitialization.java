package com.Interview.codingpractice.designpattern.singleton.rivision;

public class EagerInitialization {

    private static  EagerInitialization eagerInitialization = new EagerInitialization();

    public static EagerInitialization getEagerInitialization(){
        return  eagerInitialization;
    }
}
