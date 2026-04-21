package com.Interview.codingpractice.designpattern.singleton.rivision.rivision1;

public class EagerInitialization {
    private static EagerInitialization eagerInitialization = new EagerInitialization();

    public static  EagerInitialization getEagerInitialization(){
        return eagerInitialization;
    }
}
