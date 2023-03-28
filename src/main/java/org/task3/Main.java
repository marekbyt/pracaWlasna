package org.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Java", 18);
        maps.put("Python", 1);
        maps.put("PHP", 0);
        print(maps);
        printWithStream(maps);


    }

    private static void print(Map<String, Integer> maps) {
        int counter = 1;
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            if (counter == maps.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", wartosc:  " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", wartosc:  " + entry.getValue() + ",");

            }
            counter++;
        }
    }
    private static void printWithStream (Map<String, Integer> maps){
        String result = maps
                .entrySet()
                .stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartosc: " + entry.getValue())
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(result);
    }
}

