package com.Interview.codingpractice.java8stream.string;

import java.util.Arrays;
import java.util.List;

public class ConvertListofListintoList {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("abs","aef","afe"),
                Arrays.asList("abv","aek","afq"),
                Arrays.asList("gbs","nef","mfe"),
                Arrays.asList("hbs","oef","wfe")
        );
        List<String> list1 = list.stream().flatMap(i-> i.stream()).toList();
        System.out.println(list1);
    }
}
