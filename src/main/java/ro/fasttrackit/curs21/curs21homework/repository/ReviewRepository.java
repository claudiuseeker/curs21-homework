package ro.fasttrackit.curs21.curs21homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ro.fasttrackit.curs21.curs21homework.model.Review;

@Component
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
