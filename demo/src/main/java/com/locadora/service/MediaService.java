package com.locadora.service;

import java.util.List;

import com.locadora.domain.enums.MediaType;
import com.locadora.domain.media.Book;
import com.locadora.domain.media.CD;
import com.locadora.domain.media.Media;
import com.locadora.repository.MediaRepository;

//também é um event Manager
public class MediaService {

    private static MediaService instance = null;
    private final MediaRepository repository;
    private final EventManager eventManager;

    private MediaService(){
        repository = MediaRepository.getInstance();
        eventManager = new EventManager();
    }

    public EventManager getEventManager(){
        return this.eventManager;
    }

    public static MediaService getInstance(){
        if(instance == null){
            instance = new MediaService();
        }
        return instance;
    }

    public void addMedia(Media media){
        repository.add(media);
        eventManager.notify("Midia adicionada: " + media.getTitle());
    }

    public List<Media> list(MediaType type){
        switch (type) {
            case BOOK:
                return repository.findAll().stream()
                    .filter(m -> m instanceof Book)
                    .toList();
            case CD:
                return repository.findAll().stream()
                    .filter(m -> m instanceof CD)
                    .toList();
            default:
                return repository.findAll();
        }
    }

    public List<Media> findMedia(String name){
        return repository.findByName(name);
    }
}
