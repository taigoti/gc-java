package br.com.taigoti.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioCollection {
    private String name;
    private Artist artist;
    private List<Audio> audioList = new ArrayList<>();

    public AudioCollection(String name, Artist artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist.getName();
    }

    public void setAudios(Audio audio) {
        this.audioList.add(audio);
    }

    private String[] getEachAudio() {
        String[] allMusics = new String[audioList.size()];

        for (int i   = 0; i < audioList.size(); i++) {
            allMusics[i] = audioList.get(i).getName();
        }

        return allMusics;
    }

    public String getAudios() {
        return Arrays.toString(getEachAudio());
    }
}
