package com.locadora.config;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
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
            //pega arquivo como recurso da aplicação dentro do jar
            InputStream in = DataReaderCSV.class.getClassLoader()
                .getResourceAsStream(path);

            if(in == null){
                System.out.println("Erro arquivo não encontrado no classPath: " + path);
                return data;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = reader.readLine();

            while(line != null){
                data.add(line.split(","));
                line = reader.readLine();
            }
            
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage() + " " + e.getCause());
        } 

        return data;
    }
    
}
