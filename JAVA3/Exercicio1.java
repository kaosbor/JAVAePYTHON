/* Exercício 1 em JAVA: Crie um programa que declare um vetor com 5 números inteiros. Em seguida, some todos os elementos do vetor e exiba o resultado. Dica: Use um loop "for" para percorrer o vetor e vá acumulando a soma dos elementos em uma variável. */
package JAVA3;

import java.io.PrintStream;

public class Exercicio1 {

    public static void main(String[] args) {

    PrintStream out = System.out;
    out.println("\033[h\033[2J"); // LIMPA A TELA

        float[] vetor = {3, 8, 5, 2, 7.5f};       // Declaração do vetor com 5 números inteiros
            // Indice    0, 1, 2, 3, 4 
        float soma1 = 0.0f;                               // Variável para armazenar a soma dos elementos do vetor
        float soma2 = 0.0f;                               // Variável para armazenar a soma dos elementos do vetor
        
        out.println("Forma NOVA de usar o for - antes do Java 5.0");
        for (float nr : vetor) {
            soma1 = soma1 + nr;
        }
        out.println("A soma dos elementos do vetor é: " + soma1); // Exibindo o resultado da soma
        out.println("Tamanho do Array (posições): " + vetor.length + "\n");        // Exibindo o tamanho do array

        out.println("Forma ANTIGA de usar o for - antes do Java 5.0");
        // Forma antiga de usar o FOR - antes do Java 5.0
        for (int i = 0; i < vetor.length; i++) {    // Loop "for" para percorrer o vetor e somar os elementos
            soma2 += vetor[i];                       // Loop "for": variavel soma recebe vetor + valor anterior
        }
        out.println("A soma dos elementos do vetor é: " + soma2); // Exibindo o resultado da soma
        out.println("Tamanho do Array (posições): " + vetor.length + "\n");        // Exibindo o tamanho do array

    }
}