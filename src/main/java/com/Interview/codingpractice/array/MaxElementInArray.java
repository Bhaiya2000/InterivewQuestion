package com.Interview.codingpractice.array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println(max);
    }
}
