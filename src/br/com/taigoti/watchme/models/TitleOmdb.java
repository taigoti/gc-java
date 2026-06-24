package br.com.taigoti.watchme.models;

public record TitleOmdb(String title, String genre, String year,
                        String imdbrating, String director, String writer,
                        String runtime, String type, String totalseasons) {
}
