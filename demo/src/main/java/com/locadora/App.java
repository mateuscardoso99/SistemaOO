package com.locadora;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.movie.Movie;
import com.locadora.service.CustomerService;
import com.locadora.service.MovieService;

public class App {
    public static void main( String[] args ){

        MovieService movieService = MovieService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
       
        initializerMovies(movieService);
        initializerCustomers(customerService);

        movieService.list().forEach(m ->
            System.out.println(m.toString())
        );

        customerService.findAll().forEach(c ->
            System.out.println(c.toString())
        );
    }

    public static void initializerMovies(MovieService service){
        service.addMovie(new Movie("Matrix", 20.90, 3));
        service.addMovie(new Movie("Mad Max", 19.90, 3));
        service.addMovie(new Movie("Piratas do Caribe", 21.00, 3));
    }

    public static void initializerCustomers(CustomerService service){
        service.addCustomer(new Customer("Jonas", "jonas@email.com", "55911"));
        service.addCustomer(new Customer("Marcos", "marcos@email.com", "55922"));
        service.addCustomer(new Customer("Matheus", "matheus@email.com", "55933"));
    }
}
