package com.locadora.command;

import java.util.Scanner;

import com.locadora.domain.media.CDFactory;
import com.locadora.domain.media.ConcretMediaRequestBuilder;
import com.locadora.domain.media.MediaRequest;
import com.locadora.service.MediaService;

public class AddCdCommand implements Command{
    
    private final Scanner scanner;
    private final MediaService mediaService;
    private final CDFactory factory;

    public AddCdCommand(Scanner scn, CDFactory factory){
        this.scanner = scn;
        this.mediaService = MediaService.getInstance();
        this.factory = factory;
    }

    @Override
    public void execute() {
        ConcretMediaRequestBuilder builder = new ConcretMediaRequestBuilder();
        try {
            System.out.println("-- Criando nova Mídia de CD --");
            System.out.println("Digite o Titulo: ");
            String title = scanner.nextLine();

            System.out.println("Digite o tempo de duração(min): ");
            int minutes = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite a quantidade: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite o preço: ");
            double price = Double.parseDouble(scanner.nextLine());

            MediaRequest request = builder.setCategory(null)
            .setDurationMinutes(minutes)
            .setPrice(price)
            .setQuantity(quantity)
            .setTitle(title)
            .build();
        
            mediaService.addMedia(factory.create(request));
        } catch (Exception e) {
            System.out.println("Exceção gerada: " + e.getCause());
        }
    }
}
