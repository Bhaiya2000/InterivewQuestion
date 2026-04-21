package com.Interview.codingpractice.newdsaquestion;

public class MergeSort {


    // to divide the array
    public static void divide(int arr[] , int startIndex, int endIndex){
        // if start index is greater or equal to ending index that means if 1 element is there then we need to put this condition
        if(startIndex >= endIndex){
            return;
        }
        int midIndex = (startIndex + endIndex)/2;

            // this represent the O(log n)
            divide(arr,startIndex, midIndex);
            divide(arr,midIndex+1,endIndex);

            // this represent O(n)
            conquer(arr,startIndex,midIndex,endIndex);
    }

    // to conquer the array
    public static void conquer(int arr[],int startIndex, int midIndex,int endIndex){
            int mergedArray[] = new int[endIndex - startIndex +1];
            int index1 = startIndex; // this index will track the first array
            int index2 = midIndex+1;   // this index will track the another array
            int x      = 0;          // this index will track the  mergedArray

        while(index1 <= midIndex && index2 <= endIndex){
            if(arr[index1] <= arr[index2]){
                mergedArray[x] = arr[index1];
                x++;
                index1++;
            }
            else{
                mergedArray[x] = arr[index2];
                x++;
                index2++;
            }
        }

        // copy remaining element
        while (index1 <= midIndex){
            mergedArray[x] = arr[index1];
            index1++;
            x++;
        }

        // copy the remaing element
        while(index2 <= endIndex){
            mergedArray[x] = arr[index2];
            index2++;
            x++;
        }

        // Copy the merged element into original array
        for(int i =0,  j = startIndex ; i<mergedArray.length; i++, j++){
            arr[j] = mergedArray[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,3,1,6,7,9,3,4,5};
        int n     = arr.length;
        divide(arr,0,n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

// 1st step is divide the array (1 - create method )
//                              (2 - pass array, start index, end index )
//                              (3 - need to find mid index
//                              (4 - now create divide method for both the halves)
// time complexity - O(nlogn)
// space complexity - O(n) for conquer method
