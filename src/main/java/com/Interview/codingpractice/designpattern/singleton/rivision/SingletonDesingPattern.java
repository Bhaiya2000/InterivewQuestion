package com.Interview.codingpractice.designpattern.singleton.rivision;

public class SingletonDesingPattern {
    public static void main(String[] args) {

        LazyInitialization lazyInitialization =  LazyInitialization.getLazyInitialization();
        LazyInitialization lazyInitialization1 =  LazyInitialization.getLazyInitialization();

        System.out.println(lazyInitialization.hashCode()+" "+ lazyInitialization1.hashCode());

        EagerInitialization eagerInitialization =  EagerInitialization.getEagerInitialization();
        EagerInitialization eagerInitialization1 =  EagerInitialization.getEagerInitialization();

        System.out.println(eagerInitialization1.hashCode()+ " "+ eagerInitialization.hashCode());


        DoubleCheckLocking doubleCheckLocking =  DoubleCheckLocking.getCheckLocking();
        DoubleCheckLocking doubleCheckLocking1 = DoubleCheckLocking.getCheckLocking();


        System.out.println(doubleCheckLocking.hashCode()+" "+doubleCheckLocking1.hashCode());
    }
}
