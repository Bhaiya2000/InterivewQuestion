package com.Interview.codingpractice.array.rivisionarray2;

public class SearchMinElementInArray {
    public static void main(String[] args) {
        int []arr = {1,4,3,2,5,6,7};
        int minElement = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(minElement > arr[i]){
                minElement = arr[i];
            }
        }
        System.out.println(minElement);
    }
}
