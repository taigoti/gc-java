package br.com.taigoti.models;

public class Audio {
    private String name;
    private Artist artist;
    private int duration;

    public Audio(String name, Artist artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist.getName();
    }

    public int getDuration() {
        return duration;
    }
}
