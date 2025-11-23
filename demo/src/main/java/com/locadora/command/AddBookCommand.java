package com.locadora.command;

import java.util.Scanner;

import com.locadora.domain.media.BookFactory;
import com.locadora.domain.media.ConcretMediaRequestBuilder;
import com.locadora.domain.media.MediaRequest;
import com.locadora.service.MediaService;

public class AddBookCommand implements Command {

    private final Scanner scanner;
    private final MediaService mediaService;
    private final BookFactory factory;

    public AddBookCommand(Scanner scn, BookFactory factory){
        this.scanner = scn;
        this.mediaService = MediaService.getInstance();
        this.factory = factory;
    }

    @Override
    public void execute() {
        
        ConcretMediaRequestBuilder builder = new ConcretMediaRequestBuilder();

        System.out.println("-- Criando nova Midia de Livro --");
        System.out.print("Título: ");
        String title = scanner.nextLine();

        System.out.print("Páginas: ");
        int pages = Integer.parseInt(scanner.nextLine());

        System.out.print("Quantidade: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Preço: ");
        double price = Double.parseDouble(scanner.nextLine());

        MediaRequest request = builder.setTitle(title)
        .setPages(pages)
        .setPrice(price)
        .setQuantity(quantity)
        .build();

        mediaService.addMedia(factory.create(request));
    }
}
