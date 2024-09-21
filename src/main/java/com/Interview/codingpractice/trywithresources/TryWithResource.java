package com.Interview.codingpractice.trywithresources;

import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in))
        {
            String s;
            System.out.println("Enter your name");
            s = sc.nextLine();
            System.out.println("Hello "+s);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
