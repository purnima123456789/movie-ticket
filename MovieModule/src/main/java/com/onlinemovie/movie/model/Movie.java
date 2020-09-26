package com.onlinemovie.movie.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Length(min = 4) // validation starting with 3
	private String movieId;
	@NotNull
	private String movieName;
	private String movieGenere;
	private String movieDirector;
	private Integer movieLength;


	@DateTimeFormat(iso = ISO.DATE)
	@NotNull
	private LocalDate movieReleaseDate;

	private Language Language;

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId
	 * @param movieName
	 * @param movieGenere
	 * @param movieDirector
	 * @param movieLength
	 */
	public Movie(@Length(min = 4) String movieId, @NotNull String movieName, String movieGenere, String movieDirector,
			Integer movieLength) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenere = movieGenere;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
	}

	/**
	 * @param movieId
	 * @param movieName
	 * @param movieGenere
	 * @param movieDirector
	 * @param movieLength
	 * @param theatre
	 * @param movieReleaseDate
	 * @param language
	 */
	public Movie(@Length(min = 4) String movieId, @NotNull String movieName, String movieGenere, String movieDirector,
			Integer movieLength, @NotNull LocalDate movieReleaseDate, Language language) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenere = movieGenere;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.movieReleaseDate = movieReleaseDate;
		Language = language;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return the movieGenere
	 */
	public String getMovieGenere() {
		return movieGenere;
	}

	/**
	 * @param movieGenere the movieGenere to set
	 */
	public void setMovieGenere(String movieGenere) {
		this.movieGenere = movieGenere;
	}

	/**
	 * @return the movieDirector
	 */
	public String getMovieDirector() {
		return movieDirector;
	}

	/**
	 * @param movieDirector the movieDirector to set
	 */
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	/**
	 * @return the movieLength
	 */
	public Integer getMovieLength() {
		return movieLength;
	}

	/**
	 * @param movieLength the movieLength to set
	 */
	public void setMovieLength(Integer movieLength) {
		this.movieLength = movieLength;
	}


	/**
	 * @return the movieReleaseDate
	 */
	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	/**
	 * @param movieReleaseDate the movieReleaseDate to set
	 */
	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	/**
	 * @return the language
	 */
	public Language getLanguage() {
		return Language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(Language language) {
		Language = language;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenere=" + movieGenere
				+ ", movieDirector=" + movieDirector + ", movieLength=" + movieLength + ", movieReleaseDate=" + movieReleaseDate + ", Language=" + Language + "]";
	}

	public Movie() {

	}

}



















//@Data
//@EqualsAndHashCode(Exclude = "Theatres")
//@ElementCollection
//private Set<String> setOfTheatre = new HashSet<String>();