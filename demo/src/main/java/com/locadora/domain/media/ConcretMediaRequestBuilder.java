package com.locadora.domain.media;

public class ConcretMediaRequestBuilder implements MediaRequestBuilder {

    private MediaRequest mediaRequest;

    public ConcretMediaRequestBuilder(){
        reset();
    }

    @Override
    public MediaRequest build() {
        MediaRequest builter = mediaRequest;
        reset();
        return builter;
    }

    @Override
    public void reset() {
        mediaRequest = new MediaRequest();
    }

    @Override
    public MediaRequestBuilder setCategory(MediaCategory category) {
        mediaRequest.mediaCategory=category;
        return this;
    }

    @Override
    public MediaRequestBuilder setDurationMinutes(int minutes) {
        mediaRequest.durationMinutes = minutes;
        return this;
    }

    @Override
    public MediaRequestBuilder setPages(int pages) {
        mediaRequest.pages=pages;
        return this;
    }

    @Override
    public MediaRequestBuilder setPrice(Double price) {
        mediaRequest.price = price;
        return this;
    }

    @Override
    public MediaRequestBuilder setQuantity(int quantity) {
        mediaRequest.quantity = quantity;
        return this;
    }

    @Override
    public MediaRequestBuilder setTitle(String title) {
        mediaRequest.title = title;
        return this;
    }

}
