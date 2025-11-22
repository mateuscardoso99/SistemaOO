package com.locadora.repository;

import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.movie.Movie;

public class MovieRepository {
    private static MovieRepository instance;

    private final List<Movie> movies = new ArrayList<Movie>();

    private MovieRepository() {}

    public static MovieRepository getInstance() {
        if (instance == null) {
            instance = new MovieRepository();
        }
        return instance;
    }

    public List<Movie> findAll() {
        return movies;
    }

    public void add(Movie movie) {
        movies.add(movie);
    }
}
