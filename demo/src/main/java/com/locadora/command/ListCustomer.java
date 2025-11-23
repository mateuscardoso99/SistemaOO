package com.locadora.command;

import com.locadora.service.CustomerService;

public class ListCustomer implements Command {

    private final CustomerService customerService;

    public ListCustomer(){
        customerService = CustomerService.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("--- LISTANDO OS CLIENTES CADASTRADOS ---");
        customerService.findAll().forEach(c -> {
            System.out.println(c.toString());
        });
    }

}
