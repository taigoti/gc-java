package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DTO {
    protected TitleOmdb createDTO(String json) {
        try {
            return buildDTO(json);
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro!");
            System.out.println(e.getMessage());
            return null;
        }
    }

    private TitleOmdb buildDTO(String json) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        return gson.fromJson(json, TitleOmdb.class);
    }
}