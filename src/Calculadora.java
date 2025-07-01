import java.util.Scanner;
public class Calculadora {
        public static double somar(double a, double b) {
        return a + b;
    }
        public static double subtrair(double a, double b) {
        return a - b;
    }
        public static double multiplicar(double a, double b) {
        return a * b;
    }
        public static double dividir(double a, double b) {
            if (b == 0) {
            System.out.println("Erro: divisão por zero!");
                return 0;
        }
            return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = somar(num1, num2);
                break;
            case "-":
                resultado = subtrair(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return; // sai do método main
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}