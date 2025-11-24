package com.locadora.domain.media;

import com.locadora.domain.enums.MediaCategory;

//objeto de requisição a ser usado nos parametros para contrução de qualquer midia
//uso do padrao builder
public class MediaRequest {
    protected String title;
    protected Double price;
    protected int quantity;
    protected MediaCategory mediaCategory;
    protected int durationMinutes;
    protected int pages;

    public MediaRequest(){}

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public MediaCategory getMediaCategory() {
        return mediaCategory;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getPages() {
        return pages;
    }
    

}
