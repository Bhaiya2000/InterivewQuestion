package com.Interview.codingpractice.multithreading;

public class CreateThreadUsingThread extends Thread {

    @Override
    public void  run(){

        for(int i =0 ; i<10; i++){
            System.out.println("Number is : " + i);
        }
    }
    public static void main(String[] args) {

        CreateThreadUsingThread createThreadUsingThread = new CreateThreadUsingThread();
        createThreadUsingThread.start();

    }
}
