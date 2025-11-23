package com.locadora.domain.media;

public class BookFactory implements MediaFactory {
    
    @Override
    public Media create(MediaRequest request) {
        return new Book(
            request.getTitle(),
            request.getPrice(),
            request.getQuantity(),
            request.getPages(),
            request.getMediaCategory()
        );
    }
}
