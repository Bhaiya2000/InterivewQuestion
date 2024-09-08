package com.Interview.codingpractice.stringoccurences;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < n; i++){
            if(map.get(s.charAt(i)) == 1){
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}
