package com.Interview.codingpractice.multithreading;

public class EvenNumberThread extends  Thread{

   private  EvenOddNumberThread evenOddNumberThread;

    public EvenNumberThread(   EvenOddNumberThread evenOddNumberThread){
        this.evenOddNumberThread = evenOddNumberThread;
    }

        @Override
        public void run(){
            evenOddNumberThread.generateEvenNumber();
    }
}
