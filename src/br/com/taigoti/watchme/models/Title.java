package br.com.taigoti.watchme.models;

public class Title {
    protected String name;
    protected String genre;
    protected String director;
    protected int duration;
    protected int year;
    protected double rating;

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void getInfos() {
        System.out.println("Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Rating: " + rating);
    }
}
