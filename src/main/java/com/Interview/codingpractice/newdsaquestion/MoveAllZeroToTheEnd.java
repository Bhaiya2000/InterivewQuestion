package com.Interview.codingpractice.newdsaquestion;

public class MoveAllZeroToTheEnd {
    public static void main(String[] args) {
//        int arr[] = {0,2,3,0,1,0,4,0};
//        int n  = arr.length;
//        int postion =0;
//        for(int i =0; i<n; i++){
//            if(arr[i] != 0 ){
//                int temp = arr[i];
//                arr[i] = arr[postion];
//                arr[postion] = temp;
//                postion++;
//            }
//        }
//        for(int i =0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

        int arr[] = {0,2,3,0,1,0,4,0};
        int n  = arr.length;
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
