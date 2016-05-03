package com.univille.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Main {
        private String activeState;
        private String initSate;

    public static void main(String[] args) throws IOException {

        List<String> file = Files.readAllLines(Paths.get("document//definitions.txt"));
        List<String> test = Files.readAllLines(Paths.get("document//test.txt"));
        HashMap<String,String> states = new HashMap<>();
        HashMap<String,String> words = new HashMap<>();
        HashMap<String,String> end = new HashMap<>();
        String[][] matrix = null;
        Main automato = new Main();

        for(int line = 0; line < file.size();line++){
            int i;

            if(line == 0){
                String[] split = file.get(line).split(" ");
                for(i =0;i < split.length;i++){
                    //System.out.println("add state: " + split[i]);
                    states.put(split[i],String.valueOf(i));
                }
            }

            else if(line == 1){
                String[] split = file.get(line).split(" ");
                for(i =0;i < split.length;i++){
                    //System.out.println("add words: " + split[i]);
                    words.put(split[i],String.valueOf(i));
                }
                matrix = new String[states.size()][words.size()];
            }

            else if(line > 1 && line <file.size()-2){
                String[] split = file.get(line).split(" ");
                for(i =0;i < split.length;i++){
                    //System.out.println("Linha: "+(line-2)+ " coluna: "+i+" add: " +split[i]);
                    matrix[line-2][i] = split[i];
                }
            }

            else if(line == file.size()-2){
                automato.activeState = file.get(line);
                automato.initSate = file.get(line);
            }

            else if(line == file.size()-1){
                String[] split = file.get(line).split(" ");
                for(i =0;i < split.length;i++){
                    //System.out.println("end words: " + split[i]);
                    end.put(split[i],String.valueOf(i));
                }
            }
        }


        FileWriter fileResponse = new FileWriter("document//result.txt");
        PrintWriter response = new PrintWriter(fileResponse);

        for(int line = 0; line < test.size();line++){
            String[] split = test.get(line).split(" ");
            for(int i =0;i < split.length;i++){
                automato.activeState = matrix[Integer.parseInt(states.get(automato.activeState))][Integer.parseInt(split[i])];
               // System.out.println("Recebeu: "+split[i]+" Foi para: "+ automato.activeState);
            }
            if(end.get(automato.activeState) == null){
                response.printf("Linha "+(line+1)+": "+"Recusado%n");
                System.out.println("Recusado");
            }
            else{
                response.printf("Linha "+(line+1)+": "+"Aceito%n");
                System.out.println("Aceito");
            }
            automato.activeState = automato.initSate;
        }

        fileResponse.close();
    }
}
