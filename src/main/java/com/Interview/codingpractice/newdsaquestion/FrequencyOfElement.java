package com.Interview.codingpractice.newdsaquestion;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4,5,4,3,2,5,6,7,8,9,6,5,4,3};
        int n = arr.length;
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+"-"+ entry.getValue() + ", ");
        }

    }
}
