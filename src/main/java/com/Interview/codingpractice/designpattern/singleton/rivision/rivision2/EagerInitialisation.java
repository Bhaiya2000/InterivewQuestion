package com.Interview.codingpractice.designpattern.singleton.rivision.rivision2;

public class EagerInitialisation {
    private  static  EagerInitialisation eagerInitialisation =  new EagerInitialisation();

    private  EagerInitialisation(){

    }

    public static EagerInitialisation getEagerInitialisation(){
        return eagerInitialisation;
    }
}
