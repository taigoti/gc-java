package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.Movie;
import br.com.taigoti.watchme.models.Series;
import br.com.taigoti.watchme.models.TitleOmdb;

public class BuildEntity {
    protected void buildEntity(TitleOmdb titleOmdb) {
        String titleType = titleOmdb.type();

        if(titleType.equals("movie")) {
            Movie myTitle = new Movie(titleOmdb);
            System.out.println(myTitle);
        }

        if(titleType.equals("series")){
            Series myTitle = new Series(titleOmdb);
            System.out.println(myTitle);
        }
    }
}
