package com.Interview.codingpractice.thread.rivision;

public class RivisionMainThread {
    public static void main(String[] args) {

        RivisionMainThread rivisionMainThread =  new RivisionMainThread();

        RivisionCreatingThreadByExtendingThreadClass rivisionCreatingThreadByExtendingThreadClass = new RivisionCreatingThreadByExtendingThreadClass();

        Thread thread =  new Thread(rivisionCreatingThreadByExtendingThreadClass);
//        thread.start();

        RivisionCreatingThreadByImplementingRunnableInterface rivisionCreatingThreadByImplementingRunnableInterface =
                new RivisionCreatingThreadByImplementingRunnableInterface();
        Thread thread1 = new Thread(rivisionCreatingThreadByImplementingRunnableInterface);
        thread1.start();
    }
}
