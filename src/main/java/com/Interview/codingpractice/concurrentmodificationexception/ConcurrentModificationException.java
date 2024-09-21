package com.Interview.codingpractice.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Use of fail- fast iterator
 */
public class ConcurrentModificationException {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("anand",1);
        map.put("david",2);
        map.put("daniel",3);
        map.put("danie",4);
        map.put("danil",5);
        map.put("daiel",6);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            if(entry.getKey().equals("anand")) {
                map.put("shukla",3);
            }
        }
        System.out.println(map);
    }
}
