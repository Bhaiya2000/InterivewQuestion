package com.Interview.codingpractice.multithreading;

public class CreateThreadUsingRunnable implements Runnable{


    @Override
    public void run() {
        try {
            int i  =0;
            while(  i< 10){
                System.out.println("Number is :"+ i);
                Thread.sleep(1000);
                i++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main (String args[]){
        CreateThreadUsingRunnable createThreadUsingRunnable =  new CreateThreadUsingRunnable();
        Thread thread =  new Thread(createThreadUsingRunnable);
        thread.start();
    }
}
