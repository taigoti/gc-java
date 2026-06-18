package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.Movie;
import br.com.taigoti.watchme.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APISearch {
    public void initSearch(String keyword) throws IOException, InterruptedException {
        String APIurl = "https://www.omdbapi.com/?t=" + keyword + "&apikey=575cebe0";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(APIurl))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TitleOmdb myMovieOmdb = gson.fromJson(json, TitleOmdb.class);

        try{
            Movie myMovie = new Movie(myMovieOmdb);

            System.out.println(json);
            System.out.println(myMovie);
        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro!");
            System.out.println(e.getMessage());
        }
    }
}