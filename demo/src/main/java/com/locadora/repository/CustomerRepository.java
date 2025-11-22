package com.locadora.repository;

import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.customer.Customer;

public class CustomerRepository {
    private static CustomerRepository instance;

    private final List<Customer> customers = new ArrayList<Customer>();

    private CustomerRepository() {}

    public static CustomerRepository getInstance() {
        if (instance == null) {
            instance = new CustomerRepository();
        }
        return instance;
    }

    public List<Customer> findAll() {
        return customers;
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public Customer findByEmail(String email){
        return this.customers.stream()
                .filter(c -> c.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}
