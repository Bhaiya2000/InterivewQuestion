package com.Interview.codingpractice.techbullsrivision.basic;

public class PerfectNumber {
    public static void main(String[] args) {
        int num =  5;
        int originalNumber  = num;
        int sum = 0;
       for(int i =1; i<=num; i++){
           if(num%i == 0){
               sum = sum +i;
           }
       }
       if(num == originalNumber){
           System.out.println("Perfect number");
       }
       else{
           System.out.println("Not perfect number");
       }
    }
}
