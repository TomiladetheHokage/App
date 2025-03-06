package com.moviemanager.moviemanager.Service;

import com.moviemanager.moviemanager.Data.Models.Movie;
import com.moviemanager.moviemanager.Data.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public String saveMovie(String title, String description){
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setDescription(description);
        movieRepo.save(movie);
        return "Movie saved";
    }
}
