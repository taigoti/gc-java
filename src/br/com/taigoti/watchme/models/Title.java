package br.com.taigoti.watchme.models;

public class Title {
    protected String name;
    protected String genre;
    protected int year;
    protected double rating;

    public Title(TitleOmdb title) {
        this.name = title.title();
        this.genre = title.genre();
        this.year = Integer.parseInt(title.year());
        this.rating = Double.parseDouble(title.metascore());
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
