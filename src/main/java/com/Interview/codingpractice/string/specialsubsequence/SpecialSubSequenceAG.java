package com.Interview.codingpractice.string.specialsubsequence;

public class SpecialSubSequenceAG {
    public static void main(String[] args) {
        String s = "ABCGAB"; // output 3
        int n = s.length();
        int count =0;
        int sum = 0;
      for (int i = n-1; i >=0; i--) {
          if(s.charAt(i) == 'G'){
              count++;
          }
          else if(s.charAt(i) == 'A'){
              sum += count;
          }
      }
      System.out.println(sum);
    }
}
