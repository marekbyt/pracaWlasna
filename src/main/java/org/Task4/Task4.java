package org.Task4;

import java.util.List;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Storage storage = new Storage ();
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("0", "value0_2");
        System.out.println();
        System.out.println("print values");
        storage.printValues("0");
        System.out.println("find values");
        storage.findValues("value0_1");


    }
}
