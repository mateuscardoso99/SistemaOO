package com.locadora.domain.media;

import com.locadora.domain.enums.MediaCategory;

//concret product
public class Book extends Media {
    private int pages;

    public Book(String title, double price, int quantity, int pages, MediaCategory category) {
        super(title, price, quantity, category);
        this.pages = pages;
    }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    @Override
    public String toString(){
        return
            "Mídia: Livro" +
            super.toString() +
            "\npages: " + pages + "\n";
    }
}
