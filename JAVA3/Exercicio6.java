package java3;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio6 {
    
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] vetorPalavras = new String[4];

        PrintStream out = System.out;
        System.out.println("\033[h\033[2J"); // LIMPA A TELA

        for (int i = 0; i < vetorPalavras.length; i++) {
            out.print("Digite um nome " + (i + 1) + ": " );
            vetorPalavras[i] = scanner.next();
        }

        out.println("\n1. Palavras digitadas ma ordem:");
        for (int i = 0; i < vetorPalavras.length; i++) {
            out.println("A ordem da palavra '" + vetorPalavras[i] + "' digitada é " + (i + 1) + "." );
        }           

        System.out.println("\n2. Palavras digitadas na ordem:");
        for (int i = 0; i < vetorPalavras.length; i++) {
            System.out.println(vetorPalavras[i]);
        }

        scanner.close();
    }
}

/* Exercício 6: Crie um programa que declare um vetor com 4 palavras digitadas pelo usuário. Em seguida, exiba as palavras na ordem em que foram digitadas. Dica: Use um loop "for" para percorrer o vetor e exibir cada palavra com o comando "System.out.println()". */