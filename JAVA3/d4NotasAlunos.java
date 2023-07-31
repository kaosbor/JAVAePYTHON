/* Exercício 4: Crie um programa que declare um vetor com 6 notas de alunos (valores de 0 a 10). Calcule a média dessas notas e exiba o resultado. Dica: Percorra o vetor somando todas as notas e, no final, divida a soma pela quantidade de notas para obter a média. */

package JAVA3;

import java.io.PrintStream;

public class d4NotasAlunos {
    
    public static void main(String[] args){

        int notas[] = {4, 6, 7, 8, 9, 10};

        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA

        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        out.println("***** As notas dos alunos são: *****\n");
            for (int i = 0; i < notas.length; i++) {
                out.println("Aluno " + (i + 1 ) + ": " + notas[i]);
            }
        
        out.println("\nA médias da nota dos alunos é: " + media + ".");

    }
}