package com.Interview.codingpractice.multithreading;

public class OddNumberThread extends Thread{

    private EvenOddNumberThread evenOddNumberThread;

    public OddNumberThread(EvenOddNumberThread evenOddNumberThread){
        this.evenOddNumberThread = evenOddNumberThread;
    }

    @Override
    public void run(){
        evenOddNumberThread.generateOddNumber();
    }
}
