package com.locadora.domain.movie;

//classe auxiliar para faciliar os pedidos de filmes
public class MovieRequest {
    private int quantity;
    private String name;

    public MovieRequest(){}
    
    public MovieRequest(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
