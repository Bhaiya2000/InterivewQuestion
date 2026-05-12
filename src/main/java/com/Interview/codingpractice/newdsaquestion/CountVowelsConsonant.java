package com.Interview.codingpractice.newdsaquestion;

public class CountVowelsConsonant {
    public static void main(String[] args) {
//        String str = "abcdefghijklmnopqrstuvwxyz";
//        int n = str.length();
//        int count  = 0;
//        int count1 = 0;
//        for(int i =0; i<n; i++){
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
//                    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                count ++;
//            }
//            else{
//                count1++;
//            }
//        }
//        System.out.println("Count of viwels is : "+ count + " and Count of consonant is : "+ count1);
        String str = "abcdefghijklmnopqrstuvwxyz";
        int n = str.length();
        int count  = 0;
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u'){
                count++;
            }
            else {
                count1++;
            }
        }
        System.out.println("Count of viwels is : "+ count + " and Count of consonant is : "+ count1);
    }
}
