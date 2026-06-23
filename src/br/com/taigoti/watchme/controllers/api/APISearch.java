package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.Movie;
import br.com.taigoti.watchme.models.Series;
import br.com.taigoti.watchme.models.TitleOmdb;

public class APISearch {
    public void initSearch(String keyword) {
        String APIurl = "https://www.omdbapi.com/?t=" + keyword + "&apikey=575cebe0";
        JsonRequest jsonRequest = new JsonRequest();
        DTO dto = new DTO();

        String rawJson = jsonRequest.initJsonRequest(APIurl);
        TitleOmdb title = dto.createDTO(rawJson);
        String titleType = title.type();

        try{
            if(titleType.equals("movie")) {
                Movie myTitle = new Movie(title);
                System.out.println(myTitle);
            }
            if(titleType.equals("series")){
                Series myTitle = new Series(title);
                System.out.println(myTitle);
            }
        }
        catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}