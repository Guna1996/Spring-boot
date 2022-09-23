package com.ideas2it.SpringSwagger.controller;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.SpringSwagger.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private static List<Movie> movies = new ArrayList<Movie>();

    @GetMapping
    public List<Movie> getMovies(){
        return movies;

    }

    @PostMapping
    public Movie addMovies(@RequestBody Movie movie) {
        movies.add(movie);
        return movie;
    }

}