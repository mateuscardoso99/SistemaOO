package com.locadora.domain.rental;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.movie.Movie;

public interface RentalBuilder {
    public RentalBuilder setStart(LocalDateTime start);
    public RentalBuilder setEnd(LocalDateTime end);
    public RentalBuilder setMovies(List<Movie> movies);
    public RentalBuilder setPayment(Payment payment);
    public Rental build(); 
    public void reset();
} 