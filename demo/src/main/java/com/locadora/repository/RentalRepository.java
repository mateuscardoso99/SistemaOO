package com.locadora.repository;

import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.rental.Rental;

//classe para guardar histórico de alocações
public class RentalRepository {
    private static RentalRepository instance;
    private final List<Rental> rentals = new ArrayList<>();

    private RentalRepository(){}

    public RentalRepository getInstance(){
        if(instance == null){
            instance = new RentalRepository();
        }
        return instance;
    }

}
