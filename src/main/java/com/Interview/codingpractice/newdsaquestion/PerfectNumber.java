package com.Interview.codingpractice.newdsaquestion;

public class PerfectNumber {
    public static void main(String[] args) {
//        int num = 5;
//        int originalNumber = num;
//        int sum = 0;
//        int i =1;
//        while(num > i){
//            if(num%i ==0){
//                sum =  sum + i;
//            }
//            i++;
//        }
//        if(originalNumber == sum){
//            System.out.println("Given number is perfect number");
//        }
//        else{
//            System.out.println("Given number is not a perfect number");
//        }
//        System.out.println(sum);
        int n = 5;
        int a = n;
        int sum = 0;
        int i = 1;
        while(n > i){
            if(n%i == 0){
                sum =  sum +  i;
            }
            i++;
        }
        if(n == a){
            System.out.println("Given numbe ris perfect number ");
        }
        else{
            System.out.println("Given number is not a perfect number");
        }
    }
}
