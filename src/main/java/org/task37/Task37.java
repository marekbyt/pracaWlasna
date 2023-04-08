package org.task37;

import org.task36.ThreadPalyGroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Task37 {
    public static void main(String[] args) {
       // Thread t1 = new Thread(new ThreadPalyGroundRunnable("job1"));
       // t1.start();

        Executor executor = Executors.newFixedThreadPool(2);
   for ( int i  = 0; i < 10 ; i++) {
       executor.execute(new Thread(new ThreadPalyGroundRunnable("job1"));
        }
    }
}
