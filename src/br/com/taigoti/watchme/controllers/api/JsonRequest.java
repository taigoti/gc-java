package br.com.taigoti.watchme.controllers.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonRequest {
    protected String initJsonRequest(String URL) {
        try{
            return queryJson(URL);
        } catch (IOException | InterruptedException e) {
            System.out.println("Ocorreu um erro!");
            return "ERROR: Json request failed";
        }
    }

    private String queryJson(String URL) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body().toLowerCase();
    }
}
