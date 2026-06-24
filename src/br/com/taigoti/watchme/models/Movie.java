package br.com.taigoti.watchme.models;

public class Movie extends Title {
    private String director;
    private String runtime;

    public Movie(TitleOmdb title) {
        super(title);
        this.director = title.director();
        this.runtime = title.runtime();
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
                " , writer: " + writer +
                " , runtime: " + runtime +
                '}';
    }
}
