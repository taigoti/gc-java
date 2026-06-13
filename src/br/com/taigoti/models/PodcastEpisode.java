package br.com.taigoti.models;

import java.util.ArrayList;
import java.util.List;

public class PodcastEpisode extends Audio {
    private String theme;
    private List<String> guests = new ArrayList<>();

    public PodcastEpisode(String name, Artist artist, int duration, String theme) {
        super(name, artist, duration);
        this.theme = theme;
    }

    public void setGuests(String guest) {
        guests.add(guest);
    }

    public String getGuests() {
        return guests.toString();
    }

    public void getInfos() {
        System.out.printf("'%s', com %s no Podcast %s\n", getName(), getGuests(), getArtist());
    }
}
