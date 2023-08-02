
package JAVA3;

import java.util.Scanner;

public class xtestes {
    public static void main(String[] args) {
        // Declaração dos vetores
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];

        // Entrada dos valores para o vetor1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 3 valores para o primeiro vetor:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Entrada dos valores para o vetor2
        System.out.println("Digite os 3 valores para o segundo vetor:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        System.out.println("Resultado da soma dos vetors:");
        for (int i = 0; i < 3; i++) {
             vetor3[i] = vetor1[i] + vetor2[i];
            System.out.println("Valor " + (i + 1) + ": " + vetor3[i]);
        }

        scanner.close();
    }
}
}