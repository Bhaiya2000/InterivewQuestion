package com.Interview.codingpractice.designpattern.singleton.rivision;

public class LazyInitialization {
    private static  LazyInitialization lazyInitialization;

    private LazyInitialization(){

    }


    public static LazyInitialization getLazyInitialization(){
        if(lazyInitialization == null){
            lazyInitialization =  new LazyInitialization();
        }
        return lazyInitialization;
    }

}
