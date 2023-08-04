/* Informações gerais *** Título: Exercícios de Java. Autor: RB. Date: 01/08/2023. Instituição: Senai. Curso: Desenvolvimento em Sistemas. Exercícios: 07 a 10. */

package JAVA3;

import java.io.PrintStream;
import java.util.Scanner;

/* public class Vetores { // CLASSE VETORES

    public static void main(String[] args) { // Metodo MAIN PRINCIPAL
        Scanner scanner = new Scanner(System.in);
        Exercicios.main(args);
        // PrintStream out = System.out;
        System.out.println("\033[h\033[2J"); // LIMPA A TELA
        scanner.close();
    }

} */

public class Exercicios7a10 { // CLASSE EXERCICIOS

    public static void main(String[] args) { // Metodo MAIN SECUNDÁRIO (PRINCIPAL)
        Scanner /* ?biblioteca */ scanner /* variavel */ = new Scanner(System.in); // BLIBLIOTECA + VARIAVEL = OBJETO
                                                                                  // SCANNER

        // PrintStream out = System.out;
        System.out.println("\033[h\033[2J"); // LIMPA A TELA

        // NomedaClasse.NomedoMetodo
        Exercicios7a10.Exercicio7(scanner); // Funções
        Exercicios7a10.Exercicio8(scanner); // Funções
        Exercicios7a10.Exercicio9(scanner); // Funções
        Exercicios7a10.Exercicio10(scanner); // Funções

        scanner.close();
    }

    /*
     * Exercício 7:
     * Crie um programa que declare um vetor com 5 números inteiros. Some os valores
     * do primeiro e do último elemento e exiba o resultado. Dica: Os índices dos
     * elementos em um vetor começam em 0. O primeiro elemento tem índice 0, e o
     * último tem índice igual ao tamanho do vetor menos 1 (tamanho -1).
     */
    public static void Exercicio7(Scanner scanner) { // Metodo de EXERCICIOS
        // Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;

        int[] vetor = { 3, 8, 5, 2, 7 }; // Declaração do vetor com 5 números inteiros
        // Indice 0, 1, 2, 3, 4
        int soma = 0; // Variável para armazenar a soma dos elementos do vetor -> NOVO

        soma = vetor[2] + vetor[vetor.length - 1];
        out.print("Exercicio 7:**************\n");
        // Observação: int = %d - float = %f - string = %s
        out.printf("A soma do primeiro e do ultimo elemento é %d.\n", soma);
        out.println("A soma do primeiro e do ultimo elemento é: " + soma + "."); // Exibindo o resultado da soma
        out.println("Tamanho do Array (posições): " + vetor.length + "\n"); // Exibindo o tamanho do array

        // scanner.close();
    }

    /*
     * Exercício 8:
     * Crie um programa que declare um vetor com 10 números inteiros. Peça ao
     * usuário para digitar um número e verifique se esse número está presente no
     * vetor. Dica: Use um loop "for" para percorrer o vetor e compare o número
     * digitado pelo usuário com cada elemento do vetor.
     */
    public static void Exercicio8(Scanner scanner) {
        PrintStream out = System.out;
        // Scanner scanner = new Scanner(System.in);
        int[] vetor = { 3, 8, 5, 2, 7, 3, 8, 5, 2, 7 }; // Declaração do vetor com 5 números inteiros
        // Indice 0, 1, 2, 3, 4

        out.print("Exercicio 8:**************\n");
        out.print("Usuário, digite um número: ");

        int numero = scanner.nextInt();

        boolean QQnome = false;

        for (int i = 0; i < vetor.length; i++) { // cria variavel de controle
            if (vetor[i] == numero) {
                QQnome = true;
            }
        }

        if (QQnome) {
            out.println("O valor digitado pelo usuário foi '" + numero + "' e ele EXISTE!");
        } else {
            out.println("O valor digitado pelo usuário foi '" + numero + "' e ele NÃO existe!");
        }

        out.println("Tamanho do Array (posições): " + vetor.length + "\n"); // Exibindo o tamanho do array

        // scanner.close();
    }

    /*
     * Exercício 9:
     * Crie um programa que declare um vetor com 5 números inteiros. Multiplique
     * cada elemento por 2 e exiba o vetor resultante. Dica: Use um loop "for" para
     * percorrer o vetor e, dentro do loop, multiplique cada elemento por 2.
     */
    public static void Exercicio9(Scanner scanner) {

        PrintStream out = System.out;

        // Scanner scanner = new Scanner(System.in);

        int[] vetorVezes = { 3, 8, 5, 2, 7 }; // Declaração do vetor com 5 números inteiros
        // Indice 0, 1, 2, 3, 4

        out.print("Exercicio 9:**************\n");
        out.print("Vetor resultante: "); // Exibindo o vetor resultante - variavel de controle
        for (int i = 0; i < vetorVezes.length; i++) {
            out.print(vetorVezes[i] * 2 + " ");

            /*
             * vetorVezes[0] * 2 = 3 * 2
             * vetorVezes[1] * 2 = 8 * 2
             * vetorVezes[2] * 2 = 5 * 2
             * vetorVezes[3] * 2 = 2 * 2
             * vetorVezes[4] * 2 = 7 * 2
             */
        }
        out.println("\nTamanho do Array (posições): " + vetorVezes.length + "\n"); // Exibindo o tamanho do array

        // scanner.close();
    }

    /*
     * Exercício 10:
     * Crie um programa que declare dois vetores com 3 números inteiros cada. A
     * seguir, crie um terceiro vetor que seja a soma dos elementos dos dois
     * primeiros e exiba o terceiro vetor. Dica: Use um loop "for" para percorrer os
     * vetores e, em cada iteração, some os elementos correspondentes dos vetores 1
     * e 2 para preencher o vetor 3.
     */

    public static void Exercicio10(Scanner scanner) {

        // Scanner scanner = new Scanner(System.in);

        // Declaração dos vetores
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];

        // Entrada dos valores para o vetor1

        System.out.print("Exercicio 10:**************\n");
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

        // scanner.close();
    }
}