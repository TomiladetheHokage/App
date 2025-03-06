package com.moviemanager.moviemanager;

import com.moviemanager.moviemanager.Data.Models.Movie;
import com.moviemanager.moviemanager.Service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MovieSeerviceTest {

    @Autowired
    private MovieService movieService;

    @Test
    public void testMovieSeervice() {
       String response = movieService.saveMovie("code 1", "a good one");
       assertThat(response).isNotNull();
    }
}
