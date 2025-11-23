package com.locadora;

import com.locadora.config.DataSeed;
import com.locadora.service.CustomerService;
import com.locadora.service.MediaService;

public class App {
    public static void main( String[] args ){

        MediaService mediaService = MediaService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
       
        DataSeed.initializerMedia(mediaService);
        DataSeed.initializerCustomers(customerService);

        mediaService.list().forEach(m ->
            System.out.println(m.toString())
        );
    }
}
