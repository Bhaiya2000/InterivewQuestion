package com.Interview.codingpractice.designpattern.singleton.rivision.rivision1;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization(){

    }

    public static LazyInitialization getLazyInitialization(){
        if(lazyInitialization == null){
            lazyInitialization =  new LazyInitialization();
        }
        return lazyInitialization;
    }
}
