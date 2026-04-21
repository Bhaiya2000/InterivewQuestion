package com.Interview.codingpractice.array.rivisionarray2;

public class SearchElementInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,6,5,4,8,9};
        int targetElement = 7;
        int n = arr.length;
        boolean flag  = false;
        for(int i=0; i<n; i++){
            if(arr[i] == targetElement){
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }
    }
}
