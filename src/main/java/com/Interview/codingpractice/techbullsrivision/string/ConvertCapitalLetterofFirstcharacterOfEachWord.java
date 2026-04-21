package com.Interview.codingpractice.techbullsrivision.string;

public class ConvertCapitalLetterofFirstcharacterOfEachWord {
    public static void main(String[] args) {
        String s = "welcome to java";
        int n = s.length();
        StringBuilder stringBuilder =  new StringBuilder();
        int i =0;
        while(i<n ){
            while(i<n && s.charAt(i) == ' '){
                i++;
            }

            StringBuilder stringBuilder1 =  new StringBuilder();
            boolean flag = true;

            while(i<n && s.charAt(i) != ' '){
                if(flag == true){
                    stringBuilder1.append((char)(s.charAt(i) -32));
                    flag = false;
                }
                else{
                    stringBuilder1.append(s.charAt(i));
                }
                i++;
            }

            while(i<n && s.charAt(i) == ' '){
                i++;
            }

            stringBuilder.append(stringBuilder1);
            if(i<n){
                stringBuilder.append(' ');
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
