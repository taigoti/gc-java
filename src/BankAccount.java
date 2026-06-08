import java.util.Scanner;

public class BankAccount {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Client lina = new Client("Lina Bo Bardi", "Corrente", 3982.9f);
        int option = 0;

        lina.clientInfos();

        while(option != 4){
            showMenu();
            option = input.nextInt();

            switch(option){
                case 1 -> lina.viewBalance();
                case 2 -> lina.transfer();
                case 3 -> lina.deposit();
                case 4 -> System.out.printf("Até mais, %s!", lina.name);
                default -> System.out.println("Digite uma opção válida!");
            }
        }
    }

    public static void showMenu() {
        String menu = """
                ** Selecione uma opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """;

        System.out.println(menu);
    }
}

class Client{
    String name;
    String accountType;
    float balance;

    public Client(String name, String accountType, float balance){
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void clientInfos(){
        System.out.println("***********************\n");
        System.out.printf("Ciente: %s\n",name);
        System.out.printf("Tipo da conta: %s\n",accountType);
        System.out.printf("Saldo atual: $%.2f\n",balance);
        System.out.println("\n***********************\n");
    }

    public void viewBalance(){
        System.out.printf("Saldo atual: $%.2f\n",balance);
    }

    public void transfer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para transferir: ");
        float amount = input.nextFloat();

        balance -= amount;
        System.out.printf("Saldo atual: $%.2f\n",balance);
    }

    public void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para depositar: ");
        float amount = input.nextFloat();

        balance += amount;
        System.out.printf("Saldo atual: $%.2f\n",balance);
    }
}