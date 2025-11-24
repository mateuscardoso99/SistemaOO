package com.locadora.command.media;

import java.util.List;
import java.util.Scanner;

import com.locadora.command.Command;
import com.locadora.domain.media.Media;
import com.locadora.service.MediaService;

public class FindMedia implements Command{
    private final MediaService service;
    private final Scanner scanner;

    public FindMedia(Scanner scanner){
        service = MediaService.getInstance();
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        try {
            System.out.println("Digite o nome da midia a ser pesquisada");
            String name = scanner.nextLine();
            List<Media> matchs = service.findMedia(name);
            if(matchs!=null){
                System.out.println("Mídias encontradas");
                matchs.forEach(m ->
                System.out.println(m.toString())); 
            }  
            else{
                System.out.println("Nenhuma Mídia encontrada");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
