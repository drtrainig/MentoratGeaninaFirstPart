package com.itfactory.cap4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        String content = "Curs Geanina\n";
        Path path = Paths.get("test.txt");

//        if (!path.toFile().exists()) {
//            Files.write(path, content.getBytes());
//        } else {
//            System.out.println("Nu suprascriu");
//        }
        if (path.toFile().exists()) {
            Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
        } else {
            Files.write(path, content.getBytes());
        }
    }
}
