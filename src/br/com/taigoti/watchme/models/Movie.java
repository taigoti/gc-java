package br.com.taigoti.watchme.models;

public class Movie extends Title{
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
