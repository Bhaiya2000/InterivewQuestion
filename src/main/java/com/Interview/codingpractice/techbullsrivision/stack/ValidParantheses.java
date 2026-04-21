package com.Interview.codingpractice.techbullsrivision.stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String str = "(){}[](({}))";
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        for(int i =0; i<n; i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(str.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            } else if ( str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("valid paranthesis");
        }
        else{
            System.out.println("invalid paranthesis");
        }
    }
}
