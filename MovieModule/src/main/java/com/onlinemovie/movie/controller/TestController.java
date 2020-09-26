package com.onlinemovie.movie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemovie.movie.model.Movie;

@RestController
public class TestController {

	@RequestMapping(value = "/movie", method = RequestMethod.GET)
	public Movie firstPage() {

		Movie mv = new Movie();
		mv.setMovieName("WAR");
		mv.setMovieGenere("Action");
		mv.setMovieId("M001");
		mv.setMovieLength(120);

		return mv;
	}

}