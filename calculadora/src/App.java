import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = input.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        // Feche o objeto Scanner no final do programa.
        input.close();
    }
}
