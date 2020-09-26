package com.onlinemovie.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinemovie.movie.model.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, String> {

}
