package com.Interview.codingpractice.array.rivisionarray;

public class RivisionMaxElementArray {
    public static void main(String[] args) {
        int arr[] =  {1,4,5,3,2,5,5};
        int maxElement = Integer.MIN_VALUE;
      for(int i =0; i<arr.length; i++){
          if(maxElement < arr[i]){
              maxElement = arr[i];
          }
      }
        System.out.println(maxElement);
    }
}
