package com.locadora.command.log;

import java.util.List;

import com.locadora.command.Command;
import com.locadora.domain.log.Log;
import com.locadora.service.LogService;


public class ListLogCommand implements Command {

    private final LogService logService;

    public ListLogCommand(){
        this.logService = LogService.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n--- LISTANDO LOGS ---");
        List<Log> logs = logService.findAll();
        if(logs.isEmpty()){
            System.out.println("Nenhum log encontrado");
        }

        logs.forEach(l -> System.out.println(l.getId() + " " + l.getMessage()));
    }
}

