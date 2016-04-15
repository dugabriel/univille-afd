package com.univille.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {


        for(String line : Files.readAllLines(Paths.get("document//definitions.txt"))){

            for(String part : line.split((" "))){
                System.out.println(part);
            }

        }

    }
}
