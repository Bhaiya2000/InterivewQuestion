package com.Interview.codingpractice.designpattern.singleton.rivision.rivision2;

public class LazyLoading {
    private static LazyLoading lazyLoading;

    private LazyLoading(){

    }

    public static LazyLoading getLazyInitialiseObject(){
        if(lazyLoading == null){
            lazyLoading =  new LazyLoading();
        }
        return  lazyLoading;
    }
}
