package org.task33;

import java.nio.file.Path;
import java.util.List;

public class Task33 {
    public static void main(String[] args) {
        Path dir = Path.of("src/main/java/org/task33");
        List<String> names = ImageFinder.find(dir);
        System.out.println(names);
    }
    }

