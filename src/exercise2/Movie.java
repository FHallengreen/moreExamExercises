package exercise2;

import java.time.Year;

public class Movie {

    private String title;
    private int year;
    private Producer producer;

    public Movie (String title, int year){
        this.title = title;
        this.year = year;
    }
    public Movie (String title){
        this.title = title;
        this.year = 2022;
    }

    public Movie (String title, Producer producer){
        this.title = title;
        this.year = 2022;
        this.producer = producer;
    }



}
