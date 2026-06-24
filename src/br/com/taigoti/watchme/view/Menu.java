package br.com.taigoti.watchme.view;

public class Menu {
    public void showMenu() {
        String template = """
                Bem vindo ao WatchMe!
                Você pode consultar as informações de qualquer filme ou série.
                
                Digite aqui o que você quer assistir:
                """;
        System.out.println(template);
    }

    public String getKeyword() {
        KeywordTreatment keyword = new KeywordTreatment();

        return keyword.insertKey();
    }
}
