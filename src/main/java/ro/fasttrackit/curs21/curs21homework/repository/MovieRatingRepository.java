package ro.fasttrackit.curs21.curs21homework.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21.curs21homework.model.MovieRating;

public interface MovieRatingRepository extends JpaRepository<MovieRating, Integer> {
}
