package com.Interview.codingpractice.output;

public class FinalKeywordOutputCheck {
    public static void main(String[] args) {
        final int x;
        x = 10;
//        x = 20; // value can not be assigned more than once after declaring it as final
        System.out.println(x);

    }
}
