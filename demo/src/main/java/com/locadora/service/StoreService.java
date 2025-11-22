package com.locadora.service;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.movie.Movie;
import com.locadora.domain.store.Store;

//padrão singleton
public class StoreService {

    private static StoreService storeService = null;

    private final Store store;

    private StoreService(){
        this.store = Store.getInstanceStore();
    }

    public static StoreService getInstanceStoreService(){
        if(storeService == null){
            StoreService.storeService = new StoreService();
        }
        return storeService;
    }

    public void initializer(){
        store.getMovies().add(new Movie("Mad Max", 19.90, 3));
        store.getMovies().add(new Movie("Piratas do caribe", 20.90, 3));
        store.getMovies().add(new Movie("Matrix", 12.90, 3));
    
        store.getCustomers().add(new Customer("Jonas", "jonas@email.com", "99999"));
        store.getCustomers().add(new Customer("Rafael", "rafael@gmail.com", "88888"));
    }

    public void listMovies() {
        System.out.println("\n=== FILMES DISPONÍVEIS ===");
        store.getMovies().forEach(m -> System.out.println(m.toString()));
    }

    public void listCustomers() {
        System.out.println("\n=== CLIENTES CADASTRADOS ===");
        store.getCustomers().forEach(c -> System.out.println(c.toString()));
    }

    public void addMovie(Movie m){
        store.getMovies().add(m);
    }

    public void addCustomer(Customer c){
        store.getCustomers().add(c);
    }
}
