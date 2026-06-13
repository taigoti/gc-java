package br.com.taigoti.models;

public class Audio {
    private String name;
    private Artist artist;

    public Audio(String name, Artist artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist.getName();
    }
}
