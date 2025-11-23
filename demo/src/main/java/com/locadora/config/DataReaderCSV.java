package com.locadora.config;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*
esta classe tem a responsabilidade de ler dados dos arquivos csv 
corretamente estruturados e criar os objetos na memória
*/
public class DataReaderCSV {

    public static List<String[]> readCSV(String path){
        List<String[]> data = new ArrayList<>();

        try {
            //pega arquivo como recurso da aplicação dentro do classPath
            Path resourcePath = Path.of(
                DataReaderCSV.class.getClassLoader().getResource(path).toURI()
            );

            List<String> lines = Files.readAllLines(resourcePath);

            for (String line : lines) {
                String[] tokens = line.split(",");
                data.add(tokens);
            }
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage() + " " + e.getCause());
        } 

        return data;
    }
    
}
