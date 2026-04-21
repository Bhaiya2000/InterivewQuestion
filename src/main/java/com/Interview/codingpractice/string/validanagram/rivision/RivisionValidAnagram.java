package com.Interview.codingpractice.string.validanagram.rivision;

import java.util.HashMap;
import java.util.Scanner;

public class RivisionValidAnagram {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        String str1 =  scanner.nextLine();
        int m = str1.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        boolean flag = true;

        for(int i =0; i<m; i++){
            if(map.containsKey(str1.charAt(i))){
                int freq = map.get(str1.charAt(i));
                freq--;
                if(freq > 0){
                    map.put(str1.charAt(i),freq);
                }
                else{
                    map.remove(str1.charAt(i));
                }
            }
            else{
                flag = false;
                break;
            }
        }

        if(map.size() == 0 && flag == true){
            System.out.println("Given string is anagram");
        }
        else{
            System.out.println("Given String is not an anagram");
        }

    }
}
