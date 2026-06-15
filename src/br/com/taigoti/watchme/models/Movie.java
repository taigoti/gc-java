package br.com.taigoti.watchme.models;


public class Movie extends Title {
    private String director;
    private String roletime;

    public Movie(String name, String genre, int year, double rating,  String director, String roletime) {
        super(name, genre, year, rating);
        this.director = director;
        this.roletime = roletime;
    }
}
