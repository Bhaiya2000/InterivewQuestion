package com.Interview.codingpractice.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            if(entry.getKey().equals("A")) {
                map.put("A",2);
            }
        }
        System.out.println(map);
    }
}
