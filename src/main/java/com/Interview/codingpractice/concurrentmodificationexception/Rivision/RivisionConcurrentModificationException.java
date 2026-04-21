package com.Interview.codingpractice.concurrentmodificationexception.Rivision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RivisionConcurrentModificationException {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("anand",1);
        map.put("shukla",2);
        map.put("satna",3);

        Iterator<Map.Entry<String,Integer>> iterator =  map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> map1 =  iterator.next();
            if(map1.getKey().equals("anand")){
                map.put("shu",1);
            }
        }

        System.out.println(map);

    }
}
