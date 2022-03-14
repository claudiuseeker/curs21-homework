package ro.fasttrackit.curs21.curs21homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private int id;

    private String text;
    private String reviewer;

    public Review(){
    }

    public Review(String text, String reviewer){
        this.text=text;
        this.reviewer= reviewer;
    }

    public String getReviewer() {
        return reviewer;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", reviewer='" + reviewer + '\'' +
                '}';
    }
}
