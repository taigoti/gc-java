package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.Title;
import br.com.taigoti.watchme.models.TitleOmdb;

public class APISearch {
    public void initSearch(String keyword) {
        String APIurl = "https://www.omdbapi.com/?t=" + keyword + "&apikey=575cebe0";
        JsonRequest jsonRequest = new JsonRequest();
        DTO dto = new DTO();
        BuildEntity entity = new BuildEntity();

        String rawJson = jsonRequest.initJsonRequest(APIurl);
        TitleOmdb titleOmdb = dto.createDTO(rawJson);

        try{
            Title infos = entity.buildEntity(titleOmdb);
            System.out.println(infos);
        }
        catch (Exception e){
            System.out.println("Ocorreu um erro!");
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}