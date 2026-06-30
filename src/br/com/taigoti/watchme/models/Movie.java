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
        return "**********************************" +
                "\nMovie name: " + name +
                ",\nGenre: " + genre +
                ",\nYear: " + year +
                ",\nRating: " + rating +
                ",\nDirector: " + director +
                ",\nWriter: " + writer +
                ",\nRuntime: " + runtime +
                "\n**********************************";
    }
}
