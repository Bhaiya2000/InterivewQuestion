package com.Interview.codingpractice.multithreading;

public class EvenOddNumberThread {
    public static int n = 10;
    int count  = 1;

    public void generateEvenNumber(){

        synchronized (this) {
            while (count < n) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even number is :" + count);
                count++;
                notify();
            }
        }
    }

    public void generateOddNumber(){

        synchronized (this){
        while (count < n) {
            while (count % 2 == 0) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd number is :" + count);
            count++;
            notify();
        }
        }
    }
    public static void main(String[] args) {

        EvenOddNumberThread evenOddNumberThread =  new EvenOddNumberThread();

        EvenNumberThread evenNumberThread =  new EvenNumberThread(evenOddNumberThread);
        OddNumberThread oddNumberThread =  new OddNumberThread(evenOddNumberThread);

        evenNumberThread.start();
        oddNumberThread.start();
    }
}
