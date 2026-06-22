package com.Interview.codingpractice.string.stringreverse;

public class ReverseCharacterArray {
    public static void main(String[] args) {
//        Character [] s = {'h','e','l','l','o'};
//        System.out.println(s);
//        int n  = s.length;
//        int right =n-1;
//        int left  =0;
//        while(left < right){
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//            left++;
//            right--;
//        }
//        for(int i=0; i<n; i++) {
//            System.out.print(s[i]+" ");
//        }
//        Character [] arr = {'a','b','c','d'};
//        int n  = arr.length;
//        int left = 0;
//        int right  = n-1;
//        while(left < right){
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        for(int i =0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

        Character [] arr = {'a','b','c','d'};
        int n  = arr.length;
        int left =0;
        int right  = n-1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right --;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
