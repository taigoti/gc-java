package br.com.taigoti.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {
    private String name;
    private Artist artist;
    private List<Music> musics = new ArrayList<Music>();

    public Album(String name, Artist artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    private String[] getEachMusic() {
        String[] allMusics = new String[musics.size()];

        for (int i   = 0; i < musics.size(); i++) {
            allMusics[i] = musics.get(i).getName();
        }

        return allMusics;
    }

    public String getMusics() {
        return Arrays.toString(getEachMusic());
    }

    public void setMusics(Music music) {
        this.musics.add(music);
    }
}
