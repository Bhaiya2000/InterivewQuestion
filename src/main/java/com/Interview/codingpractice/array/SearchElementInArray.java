package com.Interview.codingpractice.array;

public class SearchElementInArray {
    public static void main(String[] args) {
//        int A[] = {1,2,3,4,5};
//        int B = 8;
//        boolean flag = false;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == B) {
//                flag = true;
//            }
//            else {
//                flag = false;
//            }
//        }
//        if (flag == true) {
//            System.out.println("Found");
//        }
//        else {
//            System.out.println("Not Found");
//        }
        int A[] = {1,3,2,4,5,6,7,8};
        int target = 9;
        boolean flag = false;
        for(int i=0; i<A.length; i++){
            if(target == A[i]){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Target element is available");
        }
        else{
            System.out.println("Target element is not available");
        }
    }
}
