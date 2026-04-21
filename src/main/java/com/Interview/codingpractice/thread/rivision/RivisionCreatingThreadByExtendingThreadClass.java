package com.Interview.codingpractice.thread.rivision;

public class RivisionCreatingThreadByExtendingThreadClass extends Thread{

    @Override
    public void run(){
         try {
             for(int i =1; i<10; i++){
                 System.out.println(Thread.currentThread().getName()+ " : "+i);
                 Thread.sleep(1000);
             }
         }
         catch (InterruptedException e){
             Thread.currentThread().interrupt();
         }
    }
}
