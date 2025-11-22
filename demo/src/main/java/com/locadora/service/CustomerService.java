package com.locadora.service;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.store.Store;

public class CustomerService {

    private static CustomerService customerService = null;

    private final Store store;

    private CustomerService(){
        this.store = Store.getInstanceStore();
    }

    public static CustomerService getInstanceCustomerService(){
        if(customerService == null){
            customerService = new CustomerService();
        }
        return customerService;
    }

}
