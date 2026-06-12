package br.com.taigoti.watchme.models;

public class Series extends Title {
    int seasons;
    int episodesPerSeason;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    @Override
    public int getDuration() {
        return duration * seasons * episodesPerSeason;
    }

    @Override
    public void getInfos() {
        super.getInfos();
        System.out.println("Episodes duration: " + duration);
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes per season: " + episodesPerSeason);
    }
}
