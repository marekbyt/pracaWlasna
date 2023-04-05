package org.task32;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        Path directFile = Path.of("src/main/java/org/task32");
        Path outputFile = directFile.resolve("cars.txt");
        List<Car> cars = List.of(
                new Car("Volvo", 300000, true),
                new Car("BMW", 120000, false)

        );
        save(outputFile, cars);
        List<Car> result = read(outputFile);
        System.out.println(result);


    }

    public static void save(Path file, List<Car> content){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.toFile()))) {
            oos.writeObject(content);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    private static List<Car> read(Path file) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.toFile()))) {
           return (List<Car>)ois.readObject();
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return Collections.emptyList();
    }
}




