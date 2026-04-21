package com.Interview.codingpractice.newdsaquestion;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 5;
        int originalNumber = num;
        int sum = 0;
        int i =1;
        while(num > i){
            if(num%i ==0){
                sum =  sum + i;
            }
            i++;
        }
        if(originalNumber == sum){
            System.out.println("Given number is perfect number");
        }
        else{
            System.out.println("Given number is not a perfect number");
        }
        System.out.println(sum);
    }
}
