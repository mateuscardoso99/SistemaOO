package com.locadora.command.users;

import java.util.Scanner;

import com.locadora.command.Command;
import com.locadora.domain.customer.Customer;
import com.locadora.service.CustomerService;

public class FindUser implements Command{
    private final CustomerService service;
    private final Scanner scanner;

    public FindUser(Scanner scanner){
        this.scanner = scanner;
        service = CustomerService.getInstance();
    }

    @Override
    public void execute() {
        try {
            System.out.println("Digite o email do usuario: ");
            String email = scanner.nextLine();
            Customer customer = service.findCustomer(email);
            if(customer != null){
                System.out.println("Cliente Encontrado: ");
                System.out.println(customer.toString());
            }
            else{
                System.out.println("Nenhum Cliente encontrado");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
