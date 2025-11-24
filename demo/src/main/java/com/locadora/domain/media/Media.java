package com.locadora.domain.media;

import com.locadora.domain.enums.MediaCategory;

//factory method abstract product
public abstract class Media {
    protected String title;
    protected Double price;
    protected int quantity;
    protected MediaCategory category;

    public Media(String title, double price, int quantity, MediaCategory category){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getTitle() { 
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public MediaCategory getCategory() {
        return category; 
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(MediaCategory category){
        this.category = category;
    }

    @Override
    public String toString(){
        return
            "\ntitle: " + title +
            "\nprice: " + price +
            "\nquantity: " + quantity +
            "\ncategory: " + category;
    }

}
