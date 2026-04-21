package com.Interview.codingpractice.output;

public class EqualsVsDoubleEqualsOperator {
    public static void main(String[] args) {
        String str = new String("Anand");
        String str1 = new String("Anand");

        System.out.println(str == str1);
        System.out.println(str.equals(str1));

    }
}
