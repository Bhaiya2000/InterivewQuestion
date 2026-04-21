package com.Interview.codingpractice.designpattern.singleton.rivision;

public class DoubleCheckLocking {

    private static  DoubleCheckLocking checkLocking;

    private DoubleCheckLocking(){

    }

    public static DoubleCheckLocking getCheckLocking(){
        if(checkLocking == null){
            synchronized (DoubleCheckLocking.class){
                if(checkLocking == null){
                    checkLocking = new DoubleCheckLocking();
                }
            }
        }
        return checkLocking;
    }
}
