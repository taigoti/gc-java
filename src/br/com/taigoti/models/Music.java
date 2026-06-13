package br.com.taigoti.models;

public class Music extends Audio{
    private Album album;

    public Music(String name, Artist artist, Album album, int duration) {
        super(name, artist, duration);
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }
}
