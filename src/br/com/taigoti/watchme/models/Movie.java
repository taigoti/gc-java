package br.com.taigoti.watchme.models;


import com.google.gson.annotations.SerializedName;

public class Movie extends Title {
    @SerializedName("Director")
    private String director;
    @SerializedName("Runtime")
    private String runtime;

    public Movie(String name, String genre, int year, double rating,  String director, String runtime) {
        super(name, genre, year, rating);
        this.director = director;
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public String getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title: " + name +
                " , genre: " + genre +
                " , year: " + year +
                " , rating: " + rating +
                " , director: " + director +
                " , runtime: " + runtime +
                '}';
    }
}
