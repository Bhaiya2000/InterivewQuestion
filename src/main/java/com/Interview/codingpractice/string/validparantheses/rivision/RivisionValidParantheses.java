package com.Interview.codingpractice.string.validparantheses.rivision;

import java.util.Scanner;
import java.util.Stack;

public class RivisionValidParantheses {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack =  new Stack<>();
        int n = str.length();
        for(int i=0; i <n ; i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(str.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            System.out.println("This string is a Valid paranthesis");
        }
        else{
            System.out.println("This is not a valid paranthesis");
        }
    }
}
