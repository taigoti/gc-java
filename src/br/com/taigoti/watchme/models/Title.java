package br.com.taigoti.watchme.models;

public class Title {
    protected String name;
    protected String genre;
    protected String year;
    protected String rating;
    protected String writer;

    public Title(TitleOmdb title) {
        this.name = title.title();
        this.genre = title.genre();
        this.year = title.year();
        this.rating = title.imdbrating();
        this.writer = title.writer();
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year='" + year + '\'' +
                ", rating=" + rating +
                '}';
    }
}
