package com.Interview.codingpractice.techbullsrivision.array;

public class MoveAllZeroToTheEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,6,4,0,4,7};
        int n = arr.length;
        int position = 0;
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
                position++;
            }
        }

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
