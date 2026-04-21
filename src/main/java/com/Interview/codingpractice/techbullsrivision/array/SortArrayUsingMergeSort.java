package com.Interview.codingpractice.techbullsrivision.array;

public class SortArrayUsingMergeSort {

    public static void divide(int arr[],int start, int end){

        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }

    public static void conquer(int arr[], int start, int mid, int end) {
        int index1 = start;
        int index2 = mid + 1;
        int x = 0;
        int mergedSortArray[] = new int[end - start + 1];

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                mergedSortArray[x] = arr[index1];
                index1++;
                x++;
            } else {
                mergedSortArray[x] = arr[index2];
                index2++;
                x++;
            }
        }

        while(index1 <= mid){
            mergedSortArray[x] = arr[index1];
            index1++;
            x++;
        }

        while (index2 <= end){
            mergedSortArray[x] = arr[index2];
            index2++;
            x++;
        }

        for(int i =0, j= start; i<mergedSortArray.length; i++,j++){
            arr[j] = mergedSortArray[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1,2,3,4,5,6};
        int n  = arr.length;
        divide(arr,0,n-1);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
