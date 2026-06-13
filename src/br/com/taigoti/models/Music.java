package br.com.taigoti.models;

public class Music extends Audio{
    private Album album;
    private int duration;

    public Music(String name, Artist artist, Album album, int duration) {
        super(name, artist);
        this.album = album;
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }
}
