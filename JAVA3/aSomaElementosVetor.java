package JAVA3;

import java.io.PrintStream;

public class aSomaElementosVetor {

    public static void main(String[] args) {

    PrintStream out = System.out;
    out.println("\033[h\033[2J"); // LIMPA A TELA

        int[] vetor = {20,20,20,20,20,50,50};       // Declaração do vetor com 5 números inteiros

        int soma = 0;                               // Variável para armazenar a soma dos elementos do vetor
        
        for (int i = 0; i < vetor.length; i++) {    // Loop "for" para percorrer o vetor e somar os elementos
            soma += vetor[i];                       // Loop "for" para percorrer o vetor e somar os elementos
        }
        out.println("A soma dos elementos do vetor é: " + soma + "\n"); // Exibindo o resultado da soma
        out.println("Tamanho do Array (posições): " + vetor.length + "\n");        // Exibindo o tamanho do array

    }
}

/*
Exercício 1 em JAVA: 
Crie um programa que declare um vetor com 5 números inteiros. Em seguida, some todos os elementos do vetor e exiba o resultado.
Dica: Use um loop "for" para percorrer o vetor e vá acumulando a soma dos elementos em uma variável.
*/