package com.locadora.domain.rental;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.movie.Movie;

public class ConcretRentalBuilder implements RentalBuilder{

    private Rental rental;

    public ConcretRentalBuilder(){
        reset();
    }

    @Override
    public void reset() {
        this.rental = new Rental();
    }

    @Override
    public RentalBuilder setStart(LocalDateTime start) {
        this.rental.setStart(start);
        return this;
    }

    @Override
    public RentalBuilder setEnd(LocalDateTime end) {
       this.rental.setEnd(end);
       return this;
    }

    @Override
    public RentalBuilder setMovies(List<Movie> movies) {
        this.rental.setMovies(movies);
        return this;
    }

    @Override
    public RentalBuilder setPayment(Payment payment) {
        this.rental.setPayment(payment);
        return this;
    }

    @Override
    public Rental build() {
        Rental built = this.rental;
        reset();
        return built;
    }
}
