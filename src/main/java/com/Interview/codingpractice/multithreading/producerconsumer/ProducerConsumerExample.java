package com.Interview.codingpractice.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

    int capacity ; // will initialise at run time
    Queue<Integer> queue = new LinkedList<>();

    public  ProducerConsumerExample(int capacity){
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while(queue.size() == capacity){
            wait(); // until these is a space in the queue
        }
        queue.add(value);
        System.out.println("Produce the value :" + value);
        notifyAll(); // notify the consumer that an Item has been produced
    }

    public synchronized  int consume() throws InterruptedException {
        while (queue.isEmpty()){
            wait(); // wait until there is an item to produce
        }
        int value  = queue.poll();
        System.out.println("consumes the value :" +value);
        notifyAll(); // notify the producer that the item has been consumed
        return value;
    }
    public static void main(String[] args) {

        ProducerConsumerExample producerConsumerExample = new ProducerConsumerExample(5);

        Thread producerThread = new Thread(() ->{
            try {
                for(int i =0; i<10 ; i++){

                    producerConsumerExample.produce(i);
                    Thread.sleep(1000); // simulate time taken to produce
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread consumerThread =  new Thread(() ->{
            try
            {
                for (int i =0; i<10; i++){

                    producerConsumerExample.consume();
                    Thread.sleep(1000); // simulate time taken to consume
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
