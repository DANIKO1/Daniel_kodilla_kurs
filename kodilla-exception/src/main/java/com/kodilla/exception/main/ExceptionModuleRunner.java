package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import java.io.UnsupportedEncodingException;
public class ExceptionModuleRunner {

    public static void main(String[] args) throws UnsupportedEncodingException {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
