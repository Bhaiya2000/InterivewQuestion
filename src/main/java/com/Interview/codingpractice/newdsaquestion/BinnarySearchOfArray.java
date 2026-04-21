package com.Interview.codingpractice.newdsaquestion;

public class BinnarySearchOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int start  = 0;
        int end = n-1;
        int target  = 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                System.out.println("Found the element at index :"+mid);
                break;
            }
            else if(arr[mid] < target){
               start = mid +1;
            }
            else{
                end  = mid - 1;
            }
        }
    }
}
