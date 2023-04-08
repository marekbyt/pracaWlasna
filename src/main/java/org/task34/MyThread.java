package org.task34;

public class MyThread extends Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(" [" + name + "]" +"Poczatek wątku");
        System.out.println(" [" + name + "]" +"Ide sobie spac");

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" [" + name + "]" +"Wstałem ");

    }
}
