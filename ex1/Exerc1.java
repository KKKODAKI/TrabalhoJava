import java.util.Scanner;

public class Exerc1 {

    static float somar(int num1, int num2){
        return num1 + num2;
    }

    static float subtrair(int num1, int num2){
        return num1 - num2;
    }

    static float multiplicar(int num1, int num2){
        return num1 * num2;
    }

    static float dividir(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float resp;

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("\nDigite a operação (+, -, *, /): ");
        String operacao = scanner.nextLine();

        System.out.print("\nDigite o primeiro número: ");
        int num2 = scanner.nextInt();

        switch (operacao) {
            case "+":
                resp = somar(num1, num2);
                System.out.println(num1 + " "  + operacao + " "  + num2 + " = "  + resp);
                break;

            case "-":
                resp = subtrair(num1, num2);
                System.out.println(num1 + " "  + operacao + " "  + num2 + " = "  + resp);
                break;

            case "*":
                resp = multiplicar(num1, num2);
                System.out.println(num1 + " "  + operacao + " "  + num2 + " = "  + resp);
                break;

            case "/":
                resp = dividir(num1, num2);
                System.out.println(num1 + " "  + operacao + " "  + num2 + " = "  + resp);
                break;
        
            default:
                System.out.println("\noperação inválida");
                break;
        }
        scanner.close();
    }
}
