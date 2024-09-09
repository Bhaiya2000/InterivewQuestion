package com.Interview.codingpractice.array;

public class RotateArrayBTimesTowardsRight {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int B = 2;
        int n = A.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        B = B%n;
         i = 0;
        j = B-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

        i = B;
        j = n-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

        for(int k=0; k<n ; k++){
            System.out.print(A[k]+" ");
        }
    }
}
