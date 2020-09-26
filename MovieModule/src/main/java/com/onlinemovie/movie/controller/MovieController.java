package com.onlinemovie.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemovie.movie.exception.AllException;
import com.onlinemovie.movie.exception.MovieException;
import com.onlinemovie.movie.model.Movie;
import com.onlinemovie.movie.service.IMovieService;


@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

	@Autowired
	public IMovieService movieService;

	@GetMapping("/searchmovie")
	public ResponseEntity<List<Movie>> findAll() throws MovieException{			
		return new ResponseEntity<List<Movie>>(movieService.findAll(), HttpStatus.OK);
	}
	//Mapping with Show
	@GetMapping("/searchshow/{movie_id}")
	public ResponseEntity<Movie> searchMovieById(@PathVariable(name="movie_id")String movieId) throws MovieException{			
		return new ResponseEntity<Movie>(movieService.searchById(movieId), HttpStatus.OK);
	}

    @PostMapping("/admin")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) throws AllException {
	movieService.save(movie);
	return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

}




















//change movie name Movie
//	@GetMapping("/searchmovie/{theatre_id}")
//	public ResponseEntity<List<Movie>> searchMovie(@PathVariable(name="theatre_id")String theatreId) throws MovieException{			
//		return new ResponseEntity<List<Movie>>(movieService.searchMovie(theatreId), HttpStatus.OK);
//	}




