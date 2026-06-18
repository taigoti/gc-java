package br.com.taigoti.watchme.models;

import java.util.ArrayList;

public class Series extends Title {
    private ArrayList<Season> seasons = new ArrayList<>();

    public Series(TitleOmdb title) {
        super(title);
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }
}
