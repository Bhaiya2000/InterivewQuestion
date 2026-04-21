package com.Interview.codingpractice.newdsaquestion.linkedlist;

import java.util.LinkedList;

public class LinkedListCode {
    public static void main(String[] args) {
        LinkedList<String> list =  new LinkedList<>();
        list.addFirst("a");
        list.addFirst("b");
        System.out.println(list);
        list.addLast("this");
        System.out.println(list);
    }
}
