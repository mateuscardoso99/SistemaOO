package com.locadora.command;

import com.locadora.service.MediaService;

public class ListMedia implements Command {
    private final MediaService mediaService;
    
    public ListMedia(){
        mediaService = MediaService.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("--- LISTANDO MIDIAS REGISTRADAS ---");
        mediaService.list().forEach(m -> {
            System.out.println(m.toString());
        });
    }
}
