/* Exercício 3: Crie um programa que declare um vetor com 8 números inteiros. Em seguida, encontre e exiba o maior valor presente no vetor. Dica: Utilize uma variável para armazenar o valor do maior número enquanto percorre o vetor com um loop "for". */

package java3;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {150, 20, 30, 100, 50, 60, 70, 80};

        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA
        
        int maiorValor = vetor[0];

        for (int i = 0; i < vetor.length; i++) { // Loop "for" para percorrer o vetor e encontrar o maior valor
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        // Exibindo o maior valor presente no vetor
        out.println("O maior valor presente no vetor é: " + maiorValor);
        out.println("O VETOR possui como maior valor: " + maiorValor);
        scanner.close();
    }
}