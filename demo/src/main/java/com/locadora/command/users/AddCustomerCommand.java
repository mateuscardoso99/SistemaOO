package com.locadora.command.users;

import java.util.Scanner;

import com.locadora.command.Command;
import com.locadora.domain.customer.Customer;
import com.locadora.service.CustomerService;

public class AddCustomerCommand implements Command{
    private final CustomerService customerService;
    private final Scanner scanner;
    
    public AddCustomerCommand(Scanner scanner){
        this.customerService = CustomerService.getInstance();
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        try{
            System.out.println("--- CADASTRANDO NOVO CLIENTE ---");
            System.out.println("Informe seu nome: ");
            String name = scanner.nextLine();
            System.out.println("Informe seu Email: ");
            String email = scanner.nextLine();
            System.out.println("Informe seu numero de telefone: ");
            String phone = scanner.nextLine();

            Customer customer = new Customer(name, email, phone);
            customerService.addCustomer(customer);
        } catch(Exception exception){
            System.out.println("Exceção gerada: " + exception.getCause());
        }
    }
}
