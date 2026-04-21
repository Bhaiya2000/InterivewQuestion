package com.Interview.codingpractice.array.rivisionarray;

public class RivisionSearchMinElement {
    public static void main(String[] args) {
        int arr[] =  {1,6,5,4,8,3,2};
        int minElement = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < minElement ){
                minElement = arr[i];
            }
        }
        System.out.println(minElement);
    }
}
