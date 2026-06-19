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
    public void initSearch(String keyword) {
        String APIurl = "https://www.omdbapi.com/?t=" + keyword + "&apikey=575cebe0";

        try {
            String json = initJsonRequest(APIurl);

            TitleOmdb myMovieOmdb = gsonBuild(json);
            createDTO(myMovieOmdb);
        }
        catch (IOException | InterruptedException e) {
            System.out.println("Ocorreu um problema!");
        }
    }

    private String initJsonRequest(String URL) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    private TitleOmdb gsonBuild(String json) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        return gson.fromJson(json, TitleOmdb.class);
    }

    private void createDTO(TitleOmdb titleOmdb) {
        try {
            Movie myMovie = new Movie(titleOmdb);

            System.out.println(myMovie);
        }
        catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro!");
            System.out.println(e.getMessage());
        }
    }
}