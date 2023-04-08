package org.task36;

public class Task36 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadPalyGroundRunnable("job1"));
        Thread t2 = new Thread(new ThreadPalyGroundRunnable("job2"));
    t1.start();
    t1.join();
    t2.start();
    }
}
