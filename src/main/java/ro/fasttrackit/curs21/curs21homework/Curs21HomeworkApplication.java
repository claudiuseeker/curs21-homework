package ro.fasttrackit.curs21.curs21homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21.curs21homework.model.Movie;
import ro.fasttrackit.curs21.curs21homework.model.MovieRating;
import ro.fasttrackit.curs21.curs21homework.model.Review;
import ro.fasttrackit.curs21.curs21homework.repository.MovieRatingRepository;
import ro.fasttrackit.curs21.curs21homework.repository.MovieRepository;

import java.util.List;

@SpringBootApplication
public class Curs21HomeworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(Curs21HomeworkApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(MovieRepository repository, MovieRatingRepository movieRatingRepository){
		return args -> {
			MovieRating imdb = movieRatingRepository.save(new MovieRating(9, "IMDB"));
			repository.saveAll(List.of(
					new Movie("Matrix", 2022, imdb, List.of(
							new Review("Un film bun", "Claudiu"),
							new Review("Masterpiece", "Bogdan"),
							new Review("Mind-blowing", "Mihai"))),
			        new Movie("The Godfather", 1972),
			        new Movie("The Dark Knight", 2008),
			        new Movie("Schindler's List", 1993)
			));
		};
	}
}
