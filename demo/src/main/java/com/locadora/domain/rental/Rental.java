package com.locadora.domain.rental;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.movie.Movie;

// classe que representa a locação de filmes com o padrão builder
// cada cliente tem uma lista de locações
public class Rental {
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Movie> movies;
    private Payment payment;

    public Rental(){}

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

     @Override
    public String toString() {
        return "Rental{" +
                "start=" + start +
                ", end=" + end +
                ", movies=" + movies +
                ", payment=" + payment +
                '}';
    }
}
