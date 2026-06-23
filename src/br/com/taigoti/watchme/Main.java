package br.com.taigoti.watchme;

import br.com.taigoti.watchme.controllers.api.APISearch;
import br.com.taigoti.watchme.view.Menu;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        String keyword = menu.getKeyword();

        APISearch search = new APISearch();
        search.initSearch(keyword);
    }
}