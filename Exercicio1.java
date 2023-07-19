import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] Declarar) {
        PrintStream out = System.out;
        out.println("\033[h\033[2J");

        Scanner scanner = new Scanner(System.in);

        // Exercício 1 (Nível Fácil - Variáveis):
            out.println("Exercício 1 (Nível Fácil - Variáveis):");

            out.print("Digite um nota número: ");
            double numero = scanner.nextDouble();
            out.println("O número declarado foi " + numero + ".");

        // Exercício 2 (Nível Fácil - Variáveis):
            out.print("\n");
            out.println("Exercício 2 (Nível Fácil - Variáveis):");

            out.print("Digite o 1º número: ");
            double numero1 = scanner.nextDouble();
            out.println("O 1º número declarado foi o nº " + numero1 + ".");
            
            out.print("Digite o 2º número: ");
            double numero2 = scanner.nextDouble();
            out.println("O 2º número declarado foi o nº" + numero2 + ".");
            
            double soma = numero1 + numero2;
            
            out.println("A soma do número " + numero1 + " + " + numero2 + " foi convertida para " + soma + ".");

        // Exercício 3 (Nível Fácil - Loops):
            out.print("\n");
            out.println("Exercício 3 (Nível Fácil - Loops):");

            out.print("Digite um número para início: ");
            int inicio = scanner.nextInt();

            out.print("Digite um número para limite: ");
            int limite = scanner.nextInt();

            for (int i = inicio; i <= limite; i++) {
                out.println(i);
            }

        out.println("O número iniciou em " + inicio + " e terminou em " + limite + ".");

        // Exercício 4 (Nível Fácil - Loops - Soma):
            out.print("\n");
            out.println("Exercício 4 (Nível Fácil - Loops - Soma):");
            out.print("Digite um número para início: ");
            int iniciar = scanner.nextInt();

            out.print("Digite um número para limite: ");
            int limitar = scanner.nextInt();

            for (int i = iniciar; i <= limitar; i++) {
                /* out.println(i); { */
                    soma = soma + i; // ou += soma foi convertida para soma + i 
                }

            out.println("A soma desde o inicio em " + iniciar + " com término em " + limitar + " foi convertida para " + soma + ".");

        // Exercício 5 (Nível Fácil - Condicionais):
            out.print("\n");
            out.println("Exercício 5 (Nível Fácil - Condicionais):");

            out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();

            if (nota >= 9) {
                out.println("A nota do aluno " + nota + " foi convertida para 'A'.");
            } else if (nota >= 8) {
                out.println("A nota do aluno " + nota + " foi convertida para 'B'.");
            } else if (nota >= 7) {
                out.println("A nota do aluno " + nota + " foi convertida para 'C'.");
            } else if (nota >= 6) {
                out.println("A nota do aluno " + nota + " foi convertida para 'D'.");
            } else if (nota >=5) {
                out.println("A nota do aluno " + nota + " foi convertida para 'E'");
            } else {
                out.println("Não ira ganhar TORTUGUITA!");
            }


        scanner.close();
    }
}