package com.locadora.command.media;

import com.locadora.command.Command;
import com.locadora.domain.enums.MediaType;
import com.locadora.service.MediaService;

public class ListMedia implements Command {
    private final MediaService mediaService;
    private final MediaType filter;

    public ListMedia(MediaType filter){
        mediaService = MediaService.getInstance();
        this.filter = filter;
    }

    @Override
    public void execute() {
        System.out.println("--- LISTANDO MIDIAS ( " + filter +" ) ---");
        mediaService.list(filter).forEach(m -> {
            System.out.println(m.toString());
        });
    }
}
