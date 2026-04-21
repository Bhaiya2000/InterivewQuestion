package com.Interview.codingpractice.designpattern.factory.rivision;

public class FactoryGrocerry {

    public static Grocerry getPrice(String grocerryType){
        if(grocerryType.trim().equalsIgnoreCase("Sugar")){
            return new Sugar();
        } else if (grocerryType.trim().equalsIgnoreCase("Biscuit")) {
            return new Biscuit();
        }
        else{
            return null;
        }
    }
}
