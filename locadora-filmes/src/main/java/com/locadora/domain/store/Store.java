package com.locadora.domain.store;

import java.util.HashSet;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.movie.Movie;

//classe que representa a loja de filmes com padão singleton
public class Store{
    private static Store instance = null;

    private HashSet<Movie> movies = new HashSet<Movie>();

    private HashSet<Customer> customers = new HashSet<Customer>();

    private Store(){
        System.out.println("loja criada");
    };

    public static Store getInstanceStore(){
        if(Store.instance == null){
            Store.instance = new Store();
        }
        return Store.instance;
    }

    @Override
    public String toString() {
        return """
        ===== STORE =====
        Movies: %d
        Customers: %d
        """.formatted(movies.size(), customers.size());
    }

    public HashSet<Movie> getMovies() {
        return movies;
    }

    public void setMovies(HashSet<Movie> movies) {
        this.movies = movies;
    }

    public HashSet<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashSet<Customer> customers) {
        this.customers = customers;
    }
}
