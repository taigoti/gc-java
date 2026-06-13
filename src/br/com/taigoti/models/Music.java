package br.com.taigoti.models;

public class Music {
    private String name;
    private Artist artist;
    private Album album;
    private int duration;

    public Music(String name, Artist artist, Album album, int duration) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }
}
