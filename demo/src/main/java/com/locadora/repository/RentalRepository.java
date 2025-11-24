package com.locadora.repository;

import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.rental.Rental;

//classe para guardar histórico de alocações
public class RentalRepository {
    private static Integer autoIncrement;
    private static RentalRepository instance;
    private final List<Rental> rentals = new ArrayList<>();

    private RentalRepository(){}

    public static RentalRepository getInstance(){
        if(instance == null){
            instance = new RentalRepository();
            autoIncrement = 0;
        }
        return instance;
    }

    public void add(Rental r){
        autoIncrement++;
        r.setId(autoIncrement);
        rentals.add(r);
    }

    public Rental findById(Integer id){
        return rentals.stream()
            .filter(r -> r.getId() == id)
            .findFirst()
            .orElse(null);
    }

    public List<Rental> findAll(){
        return rentals;
    }

}
