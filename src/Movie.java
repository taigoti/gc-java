public class Movie {
    private String name;
    private String genre;
    private String director;
    private int year;
    private int duration;
    protected double rating;

    public Movie(String name, String genre, String director,
                 int year, int duration, double rating) {
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }

    void getInfos() {
        System.out.println("Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating);
    }
}
