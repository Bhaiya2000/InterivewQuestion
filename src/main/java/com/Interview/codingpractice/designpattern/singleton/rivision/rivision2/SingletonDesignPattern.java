package com.Interview.codingpractice.designpattern.singleton.rivision.rivision2;


import java.sql.SQLOutput;

public class SingletonDesignPattern {
    public static void main(String[] args) {
//        LazyLoading lazyLoading =  LazyLoading.getLazyInitialiseObject();
//        System.out.println(lazyLoading.hashCode());
//        LazyLoading lazyLoading1 =  LazyLoading.getLazyInitialiseObject();
//        System.out.println(lazyLoading1.hashCode());
//
//        EagerInitialisation eagerInitialisation =  EagerInitialisation.getEagerInitialisation();
//        System.out.println(eagerInitialisation.hashCode());
//        EagerInitialisation eagerInitialisation1 =  EagerInitialisation.getEagerInitialisation();
//        System.out.println(eagerInitialisation1.hashCode());
//
//        DoubleCheckLocking doubleCheckLocking =  DoubleCheckLocking.getDoubleCheckLocking();
//        System.out.println(doubleCheckLocking.hashCode());
//
//        DoubleCheckLocking doubleCheckLocking1 =  DoubleCheckLocking.getDoubleCheckLocking();
//        System.out.println(doubleCheckLocking1.hashCode());

        LazyLoading lazyLoading =  LazyLoading.getLazyInitialiseObject();
        LazyLoading lazyLoading1 =  LazyLoading.getLazyInitialiseObject();
        System.out.println(lazyLoading.hashCode()+" "+lazyLoading1.hashCode());

        EagerInitialisation eagerInitialisation =  EagerInitialisation.getEagerInitialisation();
        EagerInitialisation eagerInitialisation1 =  EagerInitialisation.getEagerInitialisation();

        System.out.println(eagerInitialisation.hashCode() +" "+eagerInitialisation1.hashCode());

        DoubleCheckLocking doubleCheckLocking =  DoubleCheckLocking.getDoubleCheckLocking();
        DoubleCheckLocking doubleCheckLocking1 =  DoubleCheckLocking.getDoubleCheckLocking();

        System.out.println(doubleCheckLocking.hashCode()+" "+doubleCheckLocking1.hashCode());

    }
}
