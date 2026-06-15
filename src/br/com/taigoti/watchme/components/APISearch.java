package br.com.taigoti.watchme.components;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APISearch {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");
        String key = sc.nextLine();

        while (key.isEmpty()) {
            System.out.println("Digite o nome do seu filme!\n");
        }

        String APIurl = "https://www.omdbapi.com/?t=" + key + "&apikey=575cebe0";

        HttpClient client =  HttpClient.newHttpClient();
        HttpRequest  request = HttpRequest.newBuilder()
                .uri(URI.create(APIurl))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}