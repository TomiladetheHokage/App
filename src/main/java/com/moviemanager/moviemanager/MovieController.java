package com.moviemanager.moviemanager;


import com.moviemanager.moviemanager.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/save")
    public String saveMovie(@RequestBody MovieDto movie) {
        return movieService.saveMovie(movie.getTitle(), movie.getDescription());
    }

}
