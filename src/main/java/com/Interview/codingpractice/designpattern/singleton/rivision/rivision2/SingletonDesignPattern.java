package com.Interview.codingpractice.designpattern.singleton.rivision.rivision2;


public class SingletonDesignPattern {
    public static void main(String[] args) {
        LazyLoading lazyLoading =  LazyLoading.getLazyInitialiseObject();
        System.out.println(lazyLoading.hashCode());
        LazyLoading lazyLoading1 =  LazyLoading.getLazyInitialiseObject();
        System.out.println(lazyLoading1.hashCode());

        EagerInitialisation eagerInitialisation =  EagerInitialisation.getEagerInitialisation();
        System.out.println(eagerInitialisation.hashCode());
        EagerInitialisation eagerInitialisation1 =  EagerInitialisation.getEagerInitialisation();
        System.out.println(eagerInitialisation1.hashCode());

        DoubleCheckLocking doubleCheckLocking =  DoubleCheckLocking.getDoubleCheckLocking();
        System.out.println(doubleCheckLocking.hashCode());

        DoubleCheckLocking doubleCheckLocking1 =  DoubleCheckLocking.getDoubleCheckLocking();
        System.out.println(doubleCheckLocking1.hashCode());
    }
}
