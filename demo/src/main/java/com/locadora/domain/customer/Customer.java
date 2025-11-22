package com.locadora.domain.customer;

import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.rental.Rental;

//classe que representa um cliente, tem uma lista de alocações
public class Customer implements Listener{
    private String name;
    private String email;
    private String phone;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Customer(){}

    @Override
    public void update(String msg) {
        System.out.println(msg + " enviando Email para: " + this.email);
    }

    public void addRental(Rental rental){
        this.rentals.add(rental);
    }

    public List<Rental> getRentals(){
        return this.rentals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return """
        Customer {
            name='%s',
            email='%s',
            phone='%s',
            rentals=%d
        }
        """.formatted(name, email, phone, rentals.size());
    }
    
}
