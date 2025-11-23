package com.locadora.repository;

import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.media.Media;

public class MediaRepository {
    private static MediaRepository instance;

    private final List<Media> medias = new ArrayList<Media>();

    private MediaRepository() {}

    public static MediaRepository getInstance() {
        if (instance == null) {
            instance = new MediaRepository();
        }
        return instance;
    }

    public List<Media> findAll() {
        return medias;
    }

    public void add(Media media) {
        medias.add(media);
    }
}
