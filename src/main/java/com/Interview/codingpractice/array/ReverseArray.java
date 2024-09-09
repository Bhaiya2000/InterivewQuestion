package com.Interview.codingpractice.array;

public class ReverseArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int n = A.length;
        int i =0;
        int j=n-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(A[k]+" ");
        }
    }
}
