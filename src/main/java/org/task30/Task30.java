package org.task30;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task30 {
    public static void main(String[] args) throws IOException {
        Path directFile = Path.of("src/main/java/org/task30");
        Path inputFile = directFile.resolve("sda.txt");
        if(!inputFile.toFile().exists()){
            System.out.println("Podany plik nie istnieje ");
            return;
        }
        List<String> fileContent = getFileContent(inputFile);
        System.out.println(fileContent);
        List<String> reversFileContent = reversFileContent(fileContent);
        System.out.println(reversFileContent);
        Path outputFile = reversNameFile(inputFile);
        System.out.println(outputFile.toFile().getName());
        saveFile(outputFile, reversFileContent);


    }
    private  static  List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }
    private static List<String> reversFileContent(List<String> content){
        return content.stream()
                .map(input-> new StringBuilder(input).reverse().toString())
                .toList();

    }
    private  static  Path reversNameFile (Path inputFile){
        String fileName = inputFile.toFile().getName();
        int index = fileName.lastIndexOf('.');

        String extension = "";
        if(index > 0 ) {
            extension = fileName.substring(index + 1);
            fileName = fileName.substring(0 , index);

        }
        String reversFileName = new StringBuilder(fileName).reverse().append(extension).toString();
        return  inputFile.getParent().resolve(reversFileName);
    }

    private static void saveFile(Path outputFile, List<String> content) throws IOException {
        Files.write(outputFile, content);

    }
}
