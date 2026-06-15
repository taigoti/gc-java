package br.com.taigoti.watchme.models;

public class Title {
    private String name;
    private String genre;
    private int year;
    private double rating;

    public Title(String name, String genre, int year, double rating) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }
}
