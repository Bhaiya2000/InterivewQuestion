package com.Interview.codingpractice.newdsaquestion;

public class CountEvenAndOdd {
    public static void main(String[] args) {
//        int arr[] = {2,1,4,5,6,4,3,2,6,7,8,9,2};
//        int count = 0;
//        int count1 = 0;
//        int n  = arr.length;
//        for(int i =0; i<n; i++){
//            if(arr[i] %2 == 0){
//                count++;
//            }
//            else{
//                count1++;
//            }
//        }
//        System.out.println("Count of even number is :"+count+" and count of odd number is :"+count1);
        int arr[] = {2,4,3,5,6,7,8,1,2,3,4,5,6,8};
        int n = arr.length;
        int count  = 0;
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                count++;
            }
            else {
                count1++;
            }
        }
        System.out.println("Count of even is "+count+" And count of odd is "+count1);
    }
}
