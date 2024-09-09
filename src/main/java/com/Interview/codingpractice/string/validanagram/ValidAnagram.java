package com.Interview.codingpractice.string.validanagram;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.nextLine();
        int n = s.length();
        String t =sc.nextLine();
        int m = t.length();
        HashMap<Character,Integer> hashMap =  new HashMap<>();
        for(int i =0; i<n; i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        boolean  flag  =  true;
        for(int i =0; i<m; i++)
        {
            if(hashMap.containsKey(t.charAt(i))){
                int freq = hashMap.get(t.charAt(i));
                freq--;
                if(freq > 0)
                {
                    hashMap.put(t.charAt(i), freq);
                }
                else{
                    hashMap.remove(t.charAt(i));
                }
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag == true && hashMap.size() == 0){
            System.out.println("YES, the given strings are anagram");
        }
        else{
            System.out.println("NO, the given strings are not anagram");
        }
    }
}
