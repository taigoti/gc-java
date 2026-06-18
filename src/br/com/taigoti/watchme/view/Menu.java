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

    public String insertKey() {
        String keyword = inputKey();
        keyword = keyTratament(keyword);

        return keyword;
    }

    private String inputKey() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    private String keyTratament(String key) {
        boolean emptyInput = key.isEmpty();

        while (emptyInput) {
            System.out.println("Por favor, digite o nome do filme!");

            key = inputKey();
            emptyInput = key.isEmpty();
        }

        if(key.contains(" ")) {
            key = key.replace(" ", "+");
        }

        return key;
    }
}
