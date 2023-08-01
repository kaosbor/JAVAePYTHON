/* Exercício 2 em JAVA: Crie um programa que declare um vetor com 3 nomes de frutas. Peça ao usuário para digitar um número de 0 a 2 e mostre o nome da fruta correspondente. Dica: Os vetores em Java são indexados a partir de 0. Use o número digitado pelo usuário como índice do vetor para acessar o nome da fruta. */
package JAVA3;

import java.util.Scanner;
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor com 3 nomes de frutas
        String[] frutas = {"Maçã", "Banana", "Laranja"};

        // Pedindo ao usuário para digitar um número de 0 a 2
        System.out.print("Digite um número de 0 a 2 para ver o nome da fruta correspondente: ");
        int indice = scanner.nextInt();

        // Verificando se o número digitado pelo usuário está dentro do intervalo válido
        if (indice >= 0 && indice < frutas.length) {
            // Acessando o nome da fruta no índice fornecido pelo usuário e exibindo-o
            String frutaEscolhida = frutas[indice];
            System.out.println("A fruta correspondente é: " + frutaEscolhida);
        } else {
            System.out.println("Número inválido! Digite um número de 0 a 2.");
        }

        scanner.close();
    }
}