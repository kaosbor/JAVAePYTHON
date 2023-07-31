package JAVA1;
import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos três núme5ros é: " + media);

        scanner.close();
    }
}
