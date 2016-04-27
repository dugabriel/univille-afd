package com.univille.main;

import com.univille.afd.Automata;
import com.univille.afd.State;
import com.univille.afd.Transition;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        int lineCount = 0;

        HashMap<String,String> states = new HashMap<>();
        HashMap<String,String> words = new HashMap<>();


        for(String line : Files.readAllLines(Paths.get("document//definitions.txt"))){

            for(int i = 0;i < line.split(" ").length;i++){

                //System.out.println("value: "+line.split(" ")[i]);
                if(lineCount == 0){
                    states.put(line.split(" ")[i],String.valueOf(i));
                }

                else if(lineCount == 1){
                    words.put(line.split(" ")[i],String.valueOf(i));
                }

                else if(lineCount > 1 && lineCount < line.length()-2){

                }

            }


            lineCount++;
        }


        System.out.print(words.get("1"));
    }
}
