package com.moviemanager.moviemanager.Data.Repository;

import com.moviemanager.moviemanager.Data.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
