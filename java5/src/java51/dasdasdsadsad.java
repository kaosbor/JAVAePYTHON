/* >>> Informações gerais <<<
Título: Exercícios de Java - Array 1.2 28/07/2023. Autor: RB. Date: 01/08/2023. Instituição: Senai. Curso: Desenvolvimento em Sistemas. Exercícios: 11 a 20. */

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; // Aleatória

public class Exercicios11a20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        Exercicios11a20.Exercicio11(scanner);

        scanner.close();
    }


    public static void Exercicio11(Scanner scanner) {
        PrintStream out = System.out;
        out.print("\033[h\033[2J");
        out.print("\n* * * EXERCÍCIO 11 - LISTA DE COMPRAS * * *\n");
        out.print("\n> > > Digite 5 peças de roupas: < < <\n");

        String[] objetos = new String[5];

        for (int i = 0; i < objetos.length; i++) {
            out.print("Digite a " + (i + 1) + "ª peça da lista de compras: ");
            objetos[i] = scanner.next();
        }

        out.println("\nAs peças na lista são:");
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("A " + (i + 1) + "ª peça é: " + objetos[i]);
        }

        out.println("\nAs peças na lista são:");
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("As peças são: " + objetos[i]);
        }

    }
}