package com.Interview.codingpractice.techbullsrivision.string;

public class SpecialSubSequenceAG {
    public static void main(String[] args) {
        String str = "ABCDGABG";
        int n  = str.length();
        int count  = 0;
        int sum = 0;
        for(int i =n-1; i >= 0; i--){
            if(str.charAt(i) == 'G'){
                count++;
            }
            else if(str.charAt(i) == 'A'){
                sum += count;
            }
        }
        System.out.println(sum);
    }
}
