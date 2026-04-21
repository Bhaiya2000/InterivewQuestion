package com.Interview.codingpractice.techbullsrivision.string;

public class ReverseCharacterArray {
    public static void main(String[] args) {
         char [] arr = {'a','b','c','d','e'};
         int n = arr.length;
         int i = 0;
         int j = n-1;
         while(i<j){
             char temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }
         for( i =0; i<n; i++){
             System.out.print(arr[i] +" ");
         }
    }
}
