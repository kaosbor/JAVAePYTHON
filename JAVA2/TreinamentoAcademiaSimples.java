package JAVA2;

import java.io.PrintStream;
import java.util.Scanner;

public class TreinamentoAcademiaSimples {

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA

        // Declaração das variáveis para os exercícios e repetições
        String exercicio1, exercicio2, exercicio3, exercicio4, exercicio5;
        int repeticoes1, repeticoes2, repeticoes3, repeticoes4, repeticoes5;

        // Entrada dos exercícios e repetições pelo usuário
        System.out.print("Digite o nome do exercício 1: ");
        exercicio1 = scanner.nextLine();
        System.out.print("Digite a quantidade de repetições para o exercício " + exercicio1 + ": ");
        repeticoes1 = Integer.parseInt(scanner.nextLine());

        System.out.print("\nDigite o nome do exercício 2: ");
        exercicio2 = scanner.nextLine();
        System.out.print("Digite a quantidade de repetições para o exercício " + exercicio2 + ": ");
        repeticoes2 = Integer.parseInt(scanner.nextLine());

        System.out.print("\nDigite o nome do exercício 3: ");
        exercicio3 = scanner.nextLine();
        System.out.print("Digite a quantidade de repetições para o exercício " + exercicio3 + ": ");
        repeticoes3 = Integer.parseInt(scanner.nextLine());

        System.out.print("\nDigite o nome do exercício 4: ");
        exercicio4 = scanner.nextLine();
        System.out.print("Digite a quantidade de repetições para o exercício " + exercicio4 + ": ");
        repeticoes4 = Integer.parseInt(scanner.nextLine());

        System.out.print("\nDigite o nome do exercício 5: ");
        exercicio5 = scanner.nextLine();
        System.out.print("Digite a quantidade de repetições para o exercício " + exercicio5 + ": ");
        repeticoes5 = Integer.parseInt(scanner.nextLine());

        // Exibição dos exercícios e repetições
        System.out.println("\nExercícios selecionados:");
        System.out.println(exercicio1 + " - " + repeticoes1 + " repetições");
        System.out.println(exercicio2 + " - " + repeticoes2 + " repetições");
        System.out.println(exercicio3 + " - " + repeticoes3 + " repetições");
        System.out.println(exercicio4 + " - " + repeticoes4 + " repetições");
        System.out.println(exercicio5 + " - " + repeticoes5 + " repetições");

        // Loop para realizar os exercícios
        System.out.println("\nIniciando treino...");
        int[] repeticoes = {repeticoes1, repeticoes2, repeticoes3, repeticoes4, repeticoes5};
        String[] exercicios = {exercicio1, exercicio2, exercicio3, exercicio4, exercicio5};

        for (int i = 0; i < 5; i++) {
            System.out.println("\nExercício: " + exercicios[i]);
            System.out.println("Quantidade de repetições: " + repeticoes[i]);
            System.out.print("Digite 'I' para iniciar o exercício ou 'S' para sair: ");

            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                System.out.println("Treino interrompido.");
                break;
            }

            System.out.println("Iniciando o exercício...");

            for (int rep = 1; rep <= repeticoes[i]; rep++) {
                System.out.println("Executando repetição " + rep + " do exercício " + exercicios[i]);
            }

            System.out.println("Exercício concluído!");
        }

        System.out.println("\nTreino finalizado!");
        scanner.close();
   }
}