package com.locadora;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.media.ConcretMediaRequestBuilder;
import com.locadora.domain.media.MediaRequest;
import com.locadora.service.CustomerService;
import com.locadora.service.MediaService;

public class App {
    public static void main( String[] args ){

        MediaService mediaService = MediaService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
       
        initializerMedia(mediaService);
        initializerCustomers(customerService);

        mediaService.list().forEach(m ->
            System.out.println(m.toString())
        );

        customerService.findAll().forEach(c ->
            System.out.println(c.toString())
        );
    }

    public static void initializerMedia(MediaService service){
        ConcretMediaRequestBuilder builder = new ConcretMediaRequestBuilder();
    }

    public static void initializerCustomers(CustomerService service){
        service.addCustomer(new Customer("Jonas", "jonas@email.com", "55911"));
        service.addCustomer(new Customer("Marcos", "marcos@email.com", "55922"));
        service.addCustomer(new Customer("Matheus", "matheus@email.com", "55933"));
    }
}
