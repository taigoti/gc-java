package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.Movie;
import com.google.gson.Gson;

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
        Gson gson = new Gson();
        Movie myMovie = gson.fromJson(json, Movie.class);
        System.out.println(myMovie);
    }
}