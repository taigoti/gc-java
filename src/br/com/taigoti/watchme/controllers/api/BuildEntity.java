package br.com.taigoti.watchme.controllers.api;

import br.com.taigoti.watchme.models.Movie;
import br.com.taigoti.watchme.models.Series;
import br.com.taigoti.watchme.models.Title;
import br.com.taigoti.watchme.models.TitleOmdb;

public class BuildEntity {
    protected Title buildEntity(TitleOmdb titleOmdb) {
        String titleType = titleOmdb.type();

        if(titleType.equals("movie")) {
            return new Movie(titleOmdb);
        }

        if(titleType.equals("series")){
            return new Series(titleOmdb);
        }

        return null;
    }
}
