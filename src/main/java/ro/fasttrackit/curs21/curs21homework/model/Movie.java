package ro.fasttrackit.curs21.curs21homework.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int year;

    @OneToOne
    private MovieRating movieRating;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> review;

    public Movie(){
    }

    public Movie(String name, int year){
        this(name, year, null);
    }

    public Movie(String name, int year, MovieRating movieRating){
        this(name, year, movieRating, List.of());
    }
    public Movie( String name, int year, MovieRating movieRating, List<Review> review){
        this.name=name;
        this.year=year;
        this.movieRating=movieRating;
        this.review=review;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public MovieRating getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(MovieRating movieRating) {
        this.movieRating = movieRating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
