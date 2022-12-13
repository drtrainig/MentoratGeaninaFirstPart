package com.itfactory.cap5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("Open file ");
        try {
            doSomething(true, true);

            System.out.println("Your connection");
            System.out.println("Pull data");
        } catch (Cap5Exception | OtherException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Indifirent");
        }
    }

    public static void doSomething(boolean exception, boolean otherException) throws Cap5Exception, OtherException {
        if (exception) {
            throw new Cap5Exception("There has been an exception");
        }
        if (otherException) {
            throw new OtherException("There has been another exception");
        }

        System.out.println("Message");
    }
}
