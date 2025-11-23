package com.locadora.domain.media;

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
        return super.toString() +
            "\npages: " + pages +
            "\ncategory: " + category + "\n}";
    }
}
