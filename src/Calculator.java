import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.set();
        System.out.printf("Resultado: %f\n", result);
    }

    public double set(){
        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operation;

        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextDouble();
        System.out.print("Digite o segundo numero: ");
        num2 = input.nextDouble();
        System.out.print("Digite a operação que quer fazer:\n(+, -, *, /)\n");
        operation = input.next().charAt(0);

        return calc(num1, num2, operation);
    }

    public double calc(double a, double b, char op){
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}