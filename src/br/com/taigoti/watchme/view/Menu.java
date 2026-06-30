package br.com.taigoti.watchme.view;

public class Menu {
    KeywordTreatment keyword = new KeywordTreatment();

    public void showMenu() {
        String defaultTemplate = """
                *********************************************************************
                
                Bem vindo ao WatchMe!
                Você pode consultar as informações de qualquer filme ou série.
                
                *********************************************************************
                
                Digite aqui o que você quer assistir:""";
        System.out.println(defaultTemplate);
    }

    public String getKeyword() {
        return keyword.insertKey();
    }

    public String continueSearch() {
        String continueTemplate = "\nQuer procurar outro filme/série? (s/n)";
        System.out.println(continueTemplate);

        return keyword.continueSearch();
    }
}
