package br.com.taigoti.watchme.components;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APISearch {
    public void initSearch() throws IOException, InterruptedException {
        String keyword = inputKey();
        String APIurl = "https://www.omdbapi.com/?t=" + keyword + "&apikey=575cebe0";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(APIurl))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private String inputKey() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do filme:");
        String key = sc.nextLine();

        boolean emptyInput = key.isEmpty();
        while (emptyInput) {
            System.out.println("Digite o nome do seu filme!");
            key = sc.nextLine();
            emptyInput = key.isEmpty();
        }

        if(key.contains(" ")) {
            key = key.replace(" ", "+");
        }

        return key;
    }
}