package com.Interview.codingpractice.techbullsrivision.array;

public class SearchElementSortedArrayUsingBinnarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target  = 7;
        int n = arr.length;
        int left  = 0;
        int right = n-1;
        boolean flag = false;
        while(left <= right){
            int mid  = ( left + right ) / 2;
            if(arr[mid] == target){
                flag = true;
                break;
            } else if (arr[mid] < target ) {
                    left = mid+1;

            }
            else{
                right = mid -1;
            }
        }
        if(flag == true){
            System.out.println("Element is available");
        }
        else{
            System.out.println("Element is not available");
        }
    }
}
