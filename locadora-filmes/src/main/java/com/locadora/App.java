package com.locadora;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.movie.Movie;
import com.locadora.domain.rental.ConcretRentalBuilder;
import com.locadora.domain.rental.Payment;
import com.locadora.domain.rental.Rental;
import com.locadora.domain.store.Store;

public class App {
    public static void main( String[] args ){

        Store store = Store.getInstanceStore();

        Movie m1 = new Movie("Matrix", 10.0, 3);
        Movie m2 = new Movie("John Wick", 15.0, 2);
        Movie m3 = new Movie("Avatar 2", 12.0, 5);
    
        store.getMovies().add(m1);
        store.getMovies().add(m2);
        store.getMovies().add(m3);

        Customer c1 = new Customer("Jonas", "jonas@email.com", "99999-0000");
        Customer c2 = new Customer("Rafael", "rafaelMil@email.com", "98888-1111");
        
        store.getCustomers().add(c1);
        store.getCustomers().add(c2);

        ConcretRentalBuilder builder = new ConcretRentalBuilder();
    
        Rental r1 = builder
            .setStart(LocalDateTime.now())
            .setEnd(LocalDateTime.now().plusDays(7))
            .setPayment(Payment.DEBITO)
            .setMovies(List.of(m1, m2))
            .build();
        
        Rental r2 = builder
            .setStart(LocalDateTime.now())
            .setEnd(LocalDateTime.now().plusDays(7))
            .setPayment(Payment.DEBITO)
            .setMovies(List.of(m1, m2))
            .build();
        
        c1.addRental(r1);
        c2.addRental(r2);

        System.out.println("\n=== STORE DATA ===");
        System.out.println("Filmes disponíveis:");
        store.getMovies().forEach(m -> {
            System.out.println(m.toString());
            System.out.println('\n');
        });
        
        System.out.println("\nClientes cadastrados:");
        store.getCustomers().forEach(c -> {
            System.out.println(c.toString());
            c.getRentals().forEach(r -> System.out.println(r.toString()));
            System.out.println('\n');
        });
    }
}
