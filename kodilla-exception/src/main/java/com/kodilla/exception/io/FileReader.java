package com.kodilla.exception.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(String file) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Path.of(Objects.requireNonNull(classLoader.getResource(null)).toURI()))) {
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}