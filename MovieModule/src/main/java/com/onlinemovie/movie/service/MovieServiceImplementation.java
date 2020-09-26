package com.onlinemovie.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.onlinemovie.movie.model.Movie;
import com.onlinemovie.movie.repository.IMovieRepository;

@Service
public class MovieServiceImplementation implements IMovieService {

	@Autowired
	public IMovieRepository movieRepository;
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	
	final String ROOT_URI = "http://localhost:9200/api/v1/theatre";	
	
	
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public void save(Movie movie) {
		// TODO Auto-generated method stub
		movieRepository.save(movie);
	}
	
	@Override
	public Movie searchById(String movieId) {
		// TODO Auto-generated method stub
		
		Movie m = null;
		System.out.println("****************************************************Hello");
		Optional<Movie> movie = movieRepository.findById(movieId);
		System.err.println(movie);
		if(movie.isPresent()) {
			m = new Movie();
             m= movie.get();
		}
		
		return m;
	}

}

//@Override
//public List<Movie> searchMovie(String theatreId) throws MovieException {
//	// TODO Auto-generated method stub
//	
//Object objCity = restTemplate.getForObject(ROOT_URI + "/"+theatreId, Object.class);
//       List<Movie> filteredMovie;
//		if(objCity!=null) {
//			
//		List<Movie> movie  = 	movieRepository.findAll();
//		
//		 filteredMovie = new ArrayList<Movie>();
//		
//		for(Movie m: movie) {
//			
//			 if(m.getsetOfTheatre().contains(theatreId)) {
//				  
//				 filteredMovie.add(m);
//				 
//			 }
//			
//		}
//			
//			
//		
//		}else {
//			
//			throw new MovieException("MovieNotFound",HttpStatus.NOT_FOUND);
//		}
//	
//	
//	
//	
//	return filteredMovie;
//	
//}
