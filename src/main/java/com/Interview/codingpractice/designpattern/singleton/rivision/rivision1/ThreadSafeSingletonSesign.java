package com.Interview.codingpractice.designpattern.singleton.rivision.rivision1;

public class ThreadSafeSingletonSesign {

    private static ThreadSafeSingletonSesign threadSafeSingletonSesign;

    private ThreadSafeSingletonSesign(){

    }


    public static ThreadSafeSingletonSesign threadSafeSingletonSesign(){
        if(threadSafeSingletonSesign == null){
            synchronized (ThreadSafeSingletonSesign.class){
                if(threadSafeSingletonSesign == null){
                    threadSafeSingletonSesign =  new ThreadSafeSingletonSesign();
                }
            }
        }
        return threadSafeSingletonSesign;
    }
}
