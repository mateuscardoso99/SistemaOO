package com.locadora.service;

import java.util.List;
import com.locadora.domain.rental.Rental;
import com.locadora.domain.rental.RentalStatus;
import com.locadora.repository.RentalRepository;

public class RentalService {
    private static RentalService instance;
    private static LogService logService;

    private final RentalRepository repository;

    private RentalService(){
        repository = RentalRepository.getInstance();
        logService = LogService.getInstance();
    }
    
    public static RentalService getInstance(){
        if(instance == null){
            instance = new RentalService();
        }
        return instance;
    }

    public List<Rental> listAll(RentalStatus status){
            if(status != null){
                return repository.findAll()
                .stream()
                .filter(r -> r.getStatus().equals(status))
                .toList();
            }
            return repository.findAll();
    }

    public void addRental(Rental rental){
        repository.add(rental);

        logService.register("Locação adicionada: " +
                "Id (" + rental.getId() + "), " +
                "Cliente (" + rental.getCustomer() + "), " +
                "Pagamento (" +rental.getPayment() + "), " +
                "Midias (" + rental.getMedias() + "), " +
                "Inicio (" +rental.getStart()  + "), " +
                "Fim (" +rental.getEnd() + ")"
        );
    }

}
