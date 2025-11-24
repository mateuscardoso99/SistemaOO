package com.locadora;

import java.util.Scanner;

import com.locadora.command.MenuController;
import com.locadora.command.media.AddBookCommand;
import com.locadora.command.media.AddCdCommand;
import com.locadora.command.media.ListMedia;
import com.locadora.command.users.ListCustomer;
import com.locadora.config.DataSeed;
import com.locadora.domain.enums.MediaType;
import com.locadora.domain.media.BookFactory;
import com.locadora.domain.media.CDFactory;
import com.locadora.service.CustomerService;
import com.locadora.service.MediaService;

public class App {
    public static void main( String[] args ){
        MediaService mediaService = MediaService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
       
        DataSeed.initializerMedia(mediaService);
        DataSeed.initializerCustomers(customerService);

        customerService.findAll().forEach(c -> 
            mediaService.getEventManager().register(c)
        );

        Scanner scanner = new Scanner(System.in);

        MenuController menu = new MenuController(scanner);
        menu.addCommand(1, new AddBookCommand(scanner, new BookFactory()));
        menu.addCommand(2, new AddCdCommand(scanner, new CDFactory()));
        menu.addCommand(3, new ListCustomer());
        menu.addCommand(4, new ListMedia(MediaType.ALL));
        menu.addCommand(5, new ListMedia(MediaType.BOOK));
        menu.addCommand(6, new ListMedia(MediaType.CD));

        menu.start();
    }
}
