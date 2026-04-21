package com.Interview.codingpractice.subarray.rivision;

public class RivisionSumOfAllSubArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int n  = a.length;
        int sum =0;
        int countOfElement =  0;
        for(int i =0; i<n; i++){
            int left  = i+1;
            int right = (n-1) - i+1;
            countOfElement =  left  * right;
            sum += (countOfElement * a[i]);
        }
        System.out.println(sum);
    }
}
