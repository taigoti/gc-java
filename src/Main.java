import br.com.taigoti.watchme.components.APISearch;
import br.com.taigoti.watchme.components.Menu;

import java.io.IOException;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        APISearch search = new APISearch();
        search.initSearch();
    }
}