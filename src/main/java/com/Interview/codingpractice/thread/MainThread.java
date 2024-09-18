package com.Interview.codingpractice.thread;

public class MainThread {
    public static void main(String[] args) {
        CreatingThreadByImplementingRunnableInterface creatingThreadByImplementingRunnableInterface
                = new CreatingThreadByImplementingRunnableInterface();

        Thread thread = new Thread(creatingThreadByImplementingRunnableInterface);
        thread.start();


        CreatingThreadByExtendingThreadClass creatingThreadByExtendingThreadClass =
                new CreatingThreadByExtendingThreadClass();

        Thread thread2 = new Thread(creatingThreadByExtendingThreadClass);
        thread2.start();
    }
}
