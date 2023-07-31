
/* Exercício 5:
Crie um programa que declare um vetor com 7 números inteiros. Conte quantos deles são números pares e exiba o resultado.
Dica: Use um loop "for" para percorrer o vetor e, dentro do loop, verifique se cada número é par usando o operador de módulo (%). */

package JAVA3;

import java.io.PrintStream;

public class e5VetorNrPar {

    public static void main(String[] args) {

        int[] vetor = {14, 24, 34, 35, 25, 15, 56, 100};

        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA

        int NrPar = 0;
        int MaiorValorPar = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                NrPar++;
                if (vetor[i] > MaiorValorPar) {
                    MaiorValorPar = vetor[i];
                }
            }
        }

        if (NrPar > 0) {
            out.println("O vetor possui " + NrPar + " números pares.");
            out.println("O maior número par do vetor é " + MaiorValorPar + ".");
        } else {
            out.println("Não há números pares no vetor");
        }
    }
}