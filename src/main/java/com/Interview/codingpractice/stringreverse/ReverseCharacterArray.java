package com.Interview.codingpractice.stringreverse;

public class ReverseCharacterArray {
    public static void main(String[] args) {
        Character [] s = {'h','e','l','l','o'};
        System.out.println(s);
        int n  = s.length;
        int right =n-1;
        int left  =0;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for(int i=0; i<n; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
