package com.Interview.codingpractice.concurrentmodificationexception.Rivision;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RivisionFailSafeIterator {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map =  new ConcurrentHashMap<>();
        map.put("anand",1);
        map.put("shukla",3);
        map.put("satna",6);
        map.put("birsinghpur",5);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Integer> map1 = iterator.next();
            if(map1.getKey().equals("shukla")){
                map.put("sab",3);
            }
        }
        System.out.println(map);
    }
}
