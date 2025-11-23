package com.locadora.domain.media;

public interface MediaRequestBuilder {
    public void reset();
    public MediaRequestBuilder setTitle(String title);
    public MediaRequestBuilder setCategory(MediaCategory category);
    public MediaRequestBuilder setPrice(Double price);
    public MediaRequestBuilder setQuantity(int quantity);
    public MediaRequestBuilder setPages(int pages);
    public MediaRequestBuilder setDurationMinutes(int minutes);
    public MediaRequest build();

}
