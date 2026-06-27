package br.com.taigoti.watchme.view;

import java.util.Scanner;

public class KeywordTreatment {
    protected String insertKey() {
        String keyword = inputKey();
        keyword = keyTratament(keyword);

        return keyword;
    }

    protected String continueSearch() {
        String yesOrNo = inputKey();
        yesOrNo = yesOrNo.toLowerCase();

        while(true){
            if(yesOrNo.equals("s") || yesOrNo.equals("n")) {
                return yesOrNo;
            }

            System.out.println("Digite 's' ou 'n'!!!");
            yesOrNo = inputKey();
            yesOrNo = yesOrNo.toLowerCase();
        }
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
