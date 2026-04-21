package com.Interview.codingpractice.newdsaquestion;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        int num = 123;
        int original = num;
        int count =0;
        int sum = 0;

        while(num > 0){
            int temp = num%10;
            sum = sum + (temp * temp * temp);
            num = num/10;
        }

        if(sum == original){
            System.out.println("Given number is armstrong number");
        }
        else{
            System.out.println("Given number is not armstrong number");
        }
    }
}
