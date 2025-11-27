package com.locadora.command.log;

import com.locadora.command.Command;
import com.locadora.service.LogService;


public class ListLogCommand implements Command {

    @Override
    public void execute() {
        System.out.println("\n--- LISTANDO LOGS ---");

        LogService logService = LogService.getInstance();

        if (!logService.hasLogs()) {
            System.out.println("Nenhum log registrado ainda.");
            return;
        }

        logService.printAll();
    }
}

