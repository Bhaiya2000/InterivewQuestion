package com.Interview.codingpractice.thread;

public class CreatingThreadByExtendingThreadClass extends Thread{

    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

