package br.com.taigoti.watchme.models;

public class Series extends Title {
    private String seasons;

    public Series(TitleOmdb title) {
        super(title);
        this.seasons = title.totalseasons();
    }

    @Override
    public String toString() {
        return "**********************************" +
                "Series name: " + name +
                ",\nGenre: '" + genre +
                ",\nYear: '" + year +
                ",\nRating: " + rating +
                ",\nWriter: " +  writer +
                ",\nSeasons:" + seasons +
                "\n**********************************";
    }
}
