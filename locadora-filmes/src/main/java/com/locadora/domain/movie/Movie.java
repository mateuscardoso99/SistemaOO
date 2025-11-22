package com.locadora.domain.movie;

public class Movie {
    private String name;
    private Double value;
    private Integer count;

    public Movie(){}

    public Movie(String name, Double value, Integer count){
        this.name = name;
        this.value = value;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }    

    @Override
    public String toString() {
        return "{ name: " + name +
            ", value: " + value +
            ", count: " + count + " }";
    }
}
