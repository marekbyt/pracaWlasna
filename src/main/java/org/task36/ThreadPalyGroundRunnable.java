package org.task36;

public class ThreadPalyGroundRunnable implements Runnable{
    private final String name;

    public ThreadPalyGroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for ( int i = 0 ; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("exception!");
            }
            System.out.printf("[%s] [%s]: %d\n ", threadName, name, i);

        }
    }

}
