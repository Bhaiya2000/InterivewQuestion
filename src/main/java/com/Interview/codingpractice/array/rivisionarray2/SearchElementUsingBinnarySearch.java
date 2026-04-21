package com.Interview.codingpractice.array.rivisionarray2;

public class SearchElementUsingBinnarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 8;
        int n =arr.length;
        int start =0;
        int end = n-1;
        boolean flag = false;
         while(start <= end){
             int mid  = (start+end)/2;
             if(arr[mid] == target){
                 flag =  true;
                 break;
             }
             else if(arr[mid] < target){
                 start = mid +1;
             }
             else{
                 end  = mid -1;
             }
         }



         if(flag == false){
             System.out.println("Element is not found");
         }
         else{
             System.out.println("Element is found");
         }
    }
}
