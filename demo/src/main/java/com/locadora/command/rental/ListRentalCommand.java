package com.locadora.command.rental;

import com.locadora.command.Command;
import com.locadora.domain.rental.RentalStatus;
import com.locadora.service.RentalService;

public class ListRentalCommand implements Command{
    private final RentalService service;
    private final RentalStatus status;

    public ListRentalCommand(RentalStatus status){
        this.status = status;
        this.service = RentalService.getInstance();
    }

    @Override
    public void execute() {
        System.out.println(" --- Listando Locações ---");
        service.listAll(status)
            .forEach(r -> 
                System.out.println(r.toString())
            );
    }
}
