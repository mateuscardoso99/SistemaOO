package com.locadora;

import com.locadora.service.StoreService;

public class App {
    public static void main( String[] args ){

        StoreService storeService = StoreService.getInstanceStoreService();
        storeService.initializer();

        storeService.listCustomers();
        storeService.listMovies();
    }
}
