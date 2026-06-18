package br.com.taigoti.watchme.models;

import java.util.ArrayList;

public class Series extends Title {
    private ArrayList<Season> seasons = new ArrayList<>();

    public Series(String name, String genre, int year, double rating) {
        super(name, genre, year, rating);
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }
}
