package com.Interview.codingpractice.array.rivisionarray;

public class RivisionSearchElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,5,4,3,7,6,5};
        int B = 5;
        boolean flag = false;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == B){
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Target value does not found");
        }
        else{
            System.out.println("Target value found");
        }
    }
}
