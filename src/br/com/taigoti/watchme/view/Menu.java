package br.com.taigoti.watchme.view;

import java.util.Scanner;

public class Menu {
    public void showMenu() {
        String template = """
                Bem vindo ao WatchMe!
                Você pode consultar as informações de qualquer filme.
                
                Digite aqui seu filme:
                """;
        System.out.println(template);
    }

    public String getKeyword() {
        KeywordTreatment keyword = new KeywordTreatment();

        return keyword.insertKey();
    }
}
