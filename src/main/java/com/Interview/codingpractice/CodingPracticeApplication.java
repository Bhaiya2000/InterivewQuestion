package com.Interview.codingpractice;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

//@SpringBootApplication
public class CodingPracticeApplication {

    public static void main(String[] args) {

//        SpringApplication.run(CodingPracticeApplication.class, args);
        System.out.println("Coding Practice Application");

        String str = "anand";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hashMap.put(str.charAt(i),i);
        }
        System.out.println(hashMap);

        for(Map.Entry<Character, Integer> map : hashMap.entrySet()){
            System.out.print(map.getKey()+""+map.getValue()+" ");
        }
    }

}
