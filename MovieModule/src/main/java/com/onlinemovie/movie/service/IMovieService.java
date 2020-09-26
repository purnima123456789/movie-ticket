package com.onlinemovie.movie.service;

import java.util.List;

import com.onlinemovie.movie.model.Movie;

public interface IMovieService {

	List<Movie> findAll();

	Movie searchById(String movieId);

	void save(Movie movie);

}
