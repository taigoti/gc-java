package br.com.taigoti.watchme.calculus;

import br.com.taigoti.watchme.models.Title;

public class CalculeTime {
    private int totalTime;

    public void addTitle(Title title) {
        this.totalTime += title.getDuration();
    }
    public void getTotalTime() {
        System.out.println("Minutes to see all watchlist: " + totalTime);
    }
}
