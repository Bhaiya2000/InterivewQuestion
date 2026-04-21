package com.Interview.codingpractice.multithreading.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblemUsingBlockingQueue {

    public static void main(String[] args) {
    BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);

    Thread producerThread = new Thread(() -> {
        try {
            for (int i = 0; i < 10; i++) {
//                blockingQueue.add(i);  // if the queue capacity will full it will simply throw the exception
                blockingQueue.put(i); // block the thread if the queue capacity is full
                System.out.println("Produce the value :" + i);
                Thread.sleep(1000); // simulate the time taken to produce the value
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    });

    Thread consumeThread = new Thread(() -> {
        try {
            for (int i = 0; i < 10; i++) {
//                blockingQueue.poll(); // if the queue is empty then it will directly return the null object
               Integer value =  blockingQueue.take();  // block the thread if queue is empty
                System.out.println("Consume the message :" + value);
                Thread.sleep(1000); // simluate the time taken to produce the value
            }
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
    });

    producerThread.start();
    consumeThread.start();
}
}
