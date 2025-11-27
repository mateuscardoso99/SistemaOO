package com.locadora.service;

import java.util.List;

import com.locadora.domain.customer.Customer;
import com.locadora.repository.CustomerRepository;

public class CustomerService {

    private static CustomerService instance = null;
    private final LogService logService;
    private final CustomerRepository customerRepository;

    private CustomerService(){
        this.logService = LogService.getInstance();
        this.customerRepository = CustomerRepository.getInstance();
    }

    public static CustomerService getInstance(){
        if(instance == null){
            instance = new CustomerService();
        }
        return instance;
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void addCustomer(Customer c){
        customerRepository.add(c);

        logService.addLog("Cliente adicionado: " +
                "Nome (" + c.getName() + "), " +
                "Email (" + c.getEmail() + "), " +
                "Numero (" + c.getPhone() + ")"
        );
    }

    public Customer findCustomer(String email){
        return customerRepository.findByEmail(email);
    }
}
