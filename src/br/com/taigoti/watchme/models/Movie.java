package br.com.taigoti.watchme.models;

import br.com.taigoti.watchme.calculus.Rate;

public class Movie extends Title implements Rate {
    String writer;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public void getInfos() {
        super.getInfos();
        System.out.println("Duration: " + duration);
        System.out.println("Writer: " + writer);
    }
}
