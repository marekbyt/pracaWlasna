package org.task34;

public class Task34 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        myThread1.start();
        myThread1.join();
        System.out.println("[main] ide sobie spac");
        Thread.sleep(3000);
        System.out.println("[main] Wstałem ");
        System.out.println("[main] Przeszkadzam pierwszemu watkowi");
        myThread1.interrupt();
        System.out.println("[main] juz poprzeszkadzałem pierwszemu watkowi");
        

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
