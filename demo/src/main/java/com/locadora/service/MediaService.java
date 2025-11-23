package com.locadora.service;

import java.util.List;

import com.locadora.domain.media.Media;
import com.locadora.repository.MediaRepository;

public class MediaService {

    private static MediaService instance = null;

    private final MediaRepository movieRepository;

    private MediaService(){
        movieRepository = MediaRepository.getInstance();
    }

    public static MediaService getInstance(){
        if(instance == null){
            instance = new MediaService();
        }
        return instance;
    }

    public void addMedia(Media media){
        movieRepository.add(media);
    }

    public List<Media> list(){
        return movieRepository.findAll();
    }
}
