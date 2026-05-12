package com.Interview.codingpractice.java8stream.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args) {
        String ans = "abcaebfdacbsd";

        // 1 way
        StringBuilder stringBuilder =  new StringBuilder();
        ans.chars().distinct().forEach(i->{
            stringBuilder.append((char) i);
        });
        System.out.println(stringBuilder.toString());

        // 2 way

        String result = ans.chars().distinct()
                .mapToObj(i->(char)i).map(String::valueOf).collect(Collectors.joining());
        System.out.println(result);

        String str1  = ans.chars().distinct().mapToObj(i->(char)i).map(String::valueOf).collect(Collectors.joining());
        System.out.println(str1);

        // 3 way

        String str = ans.chars().mapToObj(i-> (char) i).
                         collect(Collectors.toCollection(LinkedHashSet::new))
                .stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(str);



    }
}
