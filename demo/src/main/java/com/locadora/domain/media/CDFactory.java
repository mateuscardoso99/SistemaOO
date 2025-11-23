package com.locadora.domain.media;

public class CDFactory implements MediaFactory {
    @Override
    public Media create(MediaRequest request) {
        return new CD(
            request.getTitle(),
            request.getPrice(),
            request.getQuantity(),
            request.getMediaCategory(),
            request.getDurationMinutes()
        );
    }
}
