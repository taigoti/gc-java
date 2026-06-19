import br.com.taigoti.watchme.controllers.api.APISearch;
import br.com.taigoti.watchme.view.Menu;

import java.io.IOException;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        String keyword = menu.insertKey();

        APISearch search = new APISearch();
        search.initSearch(keyword);
    }
}