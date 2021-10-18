package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "main",
        mixinStandardHelpOptions = true)
public class Main implements Runnable {
    public static void main(String[] args) throws Exception {
        PicocliRunner.run(Main.class, args);
    }

    public void run() {
        System.out.println("Hello World");
    }
}
