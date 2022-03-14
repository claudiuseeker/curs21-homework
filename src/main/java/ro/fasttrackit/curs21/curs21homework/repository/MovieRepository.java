package ro.fasttrackit.curs21.curs21homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21.curs21homework.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
