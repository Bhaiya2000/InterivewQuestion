package com.Interview.codingpractice.string.validparantheses;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
//        String s = "({[]})";
        Scanner sc =  new Scanner(System.in); // taking input from the user
        String s  = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int n =  s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) =='(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES this is a valid parentheses");
        }
        else{
            System.out.println("NO this is not a valid parentheses");
        }
    }
}
