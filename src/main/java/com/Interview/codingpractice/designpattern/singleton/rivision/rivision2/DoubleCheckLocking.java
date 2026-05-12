package com.Interview.codingpractice.designpattern.singleton.rivision.rivision2;

public class DoubleCheckLocking {
//    private static  DoubleCheckLocking doubleCheckLocking ;
//    private DoubleCheckLocking(){
//
//    }
//    public static DoubleCheckLocking getDoubleCheckLocking(){
//        if(doubleCheckLocking == null){
//            synchronized (DoubleCheckLocking.class){
//                if(doubleCheckLocking ==  null){
//                    doubleCheckLocking =  new DoubleCheckLocking();
//                }
//            }
//        }
//        return  doubleCheckLocking;
//    }
    private  static  DoubleCheckLocking doubleCheckLocking ;

    private DoubleCheckLocking(){

    }

    public static DoubleCheckLocking getDoubleCheckLocking(){
        if(doubleCheckLocking == null){
            synchronized (DoubleCheckLocking.class){
                if(doubleCheckLocking ==  null){
                    doubleCheckLocking = new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }
}
