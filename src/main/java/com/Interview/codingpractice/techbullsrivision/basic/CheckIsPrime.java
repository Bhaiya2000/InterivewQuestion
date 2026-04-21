package com.Interview.codingpractice.techbullsrivision.basic;

public class CheckIsPrime {
    public static void main(String[] args) {
        int a = 4;
        int count  = 0;
        for(int i =1; i<=a; i++){
            if(a%i == 0){
                count++;
            }
        }

        if(count  == 2){
            System.out.println("Given number is prime");
        }
        else{
            System.out.println("Given number is not prime");
        }
    }
}
