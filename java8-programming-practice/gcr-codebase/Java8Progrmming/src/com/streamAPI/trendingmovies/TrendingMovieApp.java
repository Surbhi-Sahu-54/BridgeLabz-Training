package com.streamAPI.trendingmovies;
import java.util.*;
import java.util.stream.Collectors;

class Movie {
	    String name;
	    double rating;
	    int year;

	    Movie(String name, double rating, int year) {
	        this.name = name;
	        this.rating = rating;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return name + " | Rating: " + rating + " | Year: " + year;
	    }
	}

	public class TrendingMovieApp {

	    public static void main(String[] args) {

	        List<Movie> movies = Arrays.asList(
	                new Movie("Movie A", 8.5, 2024),
	                new Movie("Movie B", 9.1, 2025),
	                new Movie("Movie C", 7.8, 2023),
	                new Movie("Movie D", 8.9, 2025),
	                new Movie("Movie E", 9.3, 2024),
	                new Movie("Movie F", 8.2, 2022),
	                new Movie("Movie G", 9.0, 2025),
	                new Movie("Movie H", 8.7, 2024)
	        );

	        List<Movie> top5 = movies.stream()

	                // optional filter (example: rating >= 8)
	                .filter(m -> m.rating >= 8)

	                // sort by rating DESC, then year DESC
	                .sorted((m1, m2) -> {
	                    int ratingCompare = Double.compare(m2.rating, m1.rating);
	                    return ratingCompare != 0
	                            ? ratingCompare
	                            : Integer.compare(m2.year, m1.year);
	                })

	                // take top 5
	                .limit(5)

	                .collect(Collectors.toList());

	        top5.forEach(System.out::println);
	    }
}
