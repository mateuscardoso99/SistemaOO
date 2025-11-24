package com.locadora.command.rental;

import java.util.Scanner;

import com.locadora.command.Command;
import com.locadora.domain.customer.Customer;
import com.locadora.domain.rental.ConcretRentalBuilder;
import com.locadora.domain.rental.Rental;
import com.locadora.service.CustomerService;
import com.locadora.service.MediaService;
import com.locadora.service.RentalService;

public class AddRentalCommand implements Command {

    private final RentalService rentalService;
    private final MediaService mediaService;
    private final CustomerService customerService;

    private final Scanner scanner;

    public AddRentalCommand(Scanner scanner){
        this.scanner = scanner;
        this.rentalService = RentalService.getInstance();
        this.mediaService = MediaService.getInstance();
        this.customerService = CustomerService.getInstance();
    }

    @Override
    public void execute() {
        ConcretRentalBuilder builder = new ConcretRentalBuilder();

        System.out.println("--- Cadastrando nova Locação ---");
        
        // primeira parte defina o nome de seu cliente
        try {
            String email = scanner.nextLine();
            Customer customer = customerService.findCustomer(email);
            builder.setCustomer(customer);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // segunda parte defina os filmes e sua respectiva quantidade
        // enquanto for verdadeiro escolher novos filmes

        //mostrar o valor final na tela quando finalizar a compra
    }
}
