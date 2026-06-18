package br.com.taigoti.watchme.models;

import com.google.gson.annotations.SerializedName;

public class Title {
    @SerializedName("Title")
    protected String name;
    @SerializedName("Genre")
    protected String genre;
    @SerializedName("Year")
    protected int year;
    @SerializedName("imdbRating")
    protected double rating;

    public Title(String name, String genre, int year, double rating) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
}
