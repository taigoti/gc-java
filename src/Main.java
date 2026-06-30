import br.com.taigoti.watchme.controllers.api.APISearch;
import br.com.taigoti.watchme.view.Menu;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        String keyword = menu.getKeyword();

        APISearch search = new APISearch();
        search.initSearch(keyword);

        while (true) {
            String willContinue = menu.continueSearch();

            if(willContinue.equals("n")) {
                System.out.println("\n*************************************");
                System.out.println("Até mais!");
                System.out.println("*************************************\n");
                break;
            }

            System.out.println("\nnDigite o que quer buscar:");


            search.initSearch(menu.getKeyword());
        }
    }
}