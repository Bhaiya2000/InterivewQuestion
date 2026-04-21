package com.Interview.codingpractice.designpattern.singleton.rivision.rivision1;

public class SingletonDesign {
    public static void main(String[] args) {

        LazyInitialization lazyInitialization =  LazyInitialization.getLazyInitialization();
        System.out.println(lazyInitialization.hashCode());
        LazyInitialization lazyInitialization1 =  LazyInitialization.getLazyInitialization();
        System.out.println(lazyInitialization1.hashCode());



        EagerInitialization eagerInitialization = EagerInitialization.getEagerInitialization();
        System.out.println(eagerInitialization.hashCode());

        EagerInitialization eagerInitialization1 =  EagerInitialization.getEagerInitialization();
        System.out.println(eagerInitialization1.hashCode());


        ThreadSafeSingletonSesign threadSafeSingletonSesign =  ThreadSafeSingletonSesign.threadSafeSingletonSesign();
        System.out.println(threadSafeSingletonSesign.hashCode());

        ThreadSafeSingletonSesign threadSafeSingletonSesign1 =  ThreadSafeSingletonSesign.threadSafeSingletonSesign();
        System.out.println(threadSafeSingletonSesign1.hashCode());
    }
}
