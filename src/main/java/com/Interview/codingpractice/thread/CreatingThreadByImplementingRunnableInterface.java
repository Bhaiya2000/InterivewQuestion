package com.Interview.codingpractice.thread;

public class CreatingThreadByImplementingRunnableInterface implements Runnable{
    public void run(){

        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("The value of i is " + i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
