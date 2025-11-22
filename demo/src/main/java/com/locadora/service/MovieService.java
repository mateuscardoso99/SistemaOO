package com.locadora.service;

import java.util.List;
import com.locadora.domain.movie.Movie;
import com.locadora.repository.MovieRepository;

public class MovieService {

    private static MovieService instance = null;

    private final MovieRepository movieRepository;

    private MovieService(){
        movieRepository = MovieRepository.getInstance();
    }

    public static MovieService getInstance(){
        if(instance == null){
            instance = new MovieService();
        }
        return instance;
    }

    public void addMovie(Movie movie){
        movieRepository.add(movie);
    }

    public List<Movie> list(){
        return movieRepository.findAll();
    }
}
