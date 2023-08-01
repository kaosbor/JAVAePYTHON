package JAVA1;
import java.io.PrintStream; // Para aparecer na tela do print
import java.util.Scanner; // Para receber dados
import java.util.Random; // Para gerar numerais aleatórios

public class Exercicio1 {

    public static int gerarNumeroAleatorio(int min, int max) { // Função - nome gerarNumeroAleatorio
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] DECLARAR) { // método - main é palavra reservada
        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA
        Scanner scanner = new Scanner(System.in);

        // ****************************************************************************************************
        // Exercício 1 (Nível Fácil - Variáveis):
        out.println("Exercício 1 (Nível Fácil - Variáveis):");
        out.println("Digite um número: ");
        int numero0 = gerarNumeroAleatorio(1, 100);
        out.println("O número digitado foi " + numero0 + ".");

        // ****************************************************************************************************
        out.print("\n");
        // Exercício 2 (Nível Fácil - Variáveis):
        out.println("Exercício 2 (Nível Fácil - Variáveis):");

        out.print("Digite o 1º número: ");
        // int numero1 = scanner.nextDouble();
        int numero1 = gerarNumeroAleatorio(1, 100);
        out.println("O número declarado foi " + numero1 + ".");

        out.print("Digite o 2º número: ");
        // int numero2 = scanner.nextDouble();
        int numero2 = gerarNumeroAleatorio(1, 100); // Método + Dados fora dele = Objeto
        out.println("O número declarado foi " + numero2 + ".");

        out.println("O 1º número declarado foi o nº " + numero1 + ".");
        out.println("O 2º número declarado foi o nº " + numero2 + ".");

        double soma = numero1 + numero2;

        out.println("A soma dos números " + numero1 + " + " + numero2 + " é " + soma + ".");

        // ****************************************************************************************************
        out.print("\n");
        // Exercício 3 (Nível Fácil - Loops):
        ///// int numero = gerarNumeroAleatorio(1, 100);
        out.println("Exercício 3 (Nível Fácil - Loops):");

        out.print("Digite um número para início: ");
        int inicio = gerarNumeroAleatorio(1, 100);
        // int incio = scanner.nextInt();

        out.print("Digite um número para limite: ");
        int limite = gerarNumeroAleatorio(1, 100);
        // int limite = scanner.nextInt();

        for (int i = inicio; i <= limite; i++) {
            out.print(i + " ");
        }
        out.print("\n");
        out.println("O número iniciou em " + inicio + " e terminou em " + limite + ".");

        // ****************************************************************************************************
        out.print("\n");
        // Exercício 4 (Nível Fácil - Loops - Soma):
        out.println("Exercício 4 (Nível Fácil - Loops - Soma):");

        out.print("Digite um número para início: ");
        int iniciar = gerarNumeroAleatorio(1, 1000);
        // int iniciar = scanner.nextInt();

        out.print("Digite um número para limite: ");
        int limitar = gerarNumeroAleatorio(1, 1000);
        // int limitar = scanner.nextInt();

        int soma1 = 0;

        for (int i = 1; i <= limitar; i++) {
            out.println("A soma se refere aos seguintes números:");
            out.print(i);
            soma1 = soma1 + i; // ou += soma foi convertida para soma + i
        }

        out.println("O número iniciou em " + iniciar + " e terminou em " + limitar + ".");
        out.println("A soma dos números do inicio em " + iniciar + " com término em " + limitar
                + " é " + soma1 + ".");

        // ****************************************************************************************************
        out.print("\n");
        // Exercício 5 (Nível Fácil - Condicionais):
        out.println("Exercício 5 (Nível Fácil - Condicionais):");

        out.print("Digite a nota do aluno: ");
        int nota = gerarNumeroAleatorio(1, 10);

        if (nota >= 9) {
            out.println("A nota do aluno " + nota + " foi convertida para 'A'.");
        } else if (nota >= 8) {
            out.println("A nota do aluno " + nota + " foi convertida para 'B'.");
        } else if (nota >= 7) {
            out.println("A nota do aluno " + nota + " foi convertida para 'C'.");
        } else if (nota >= 6) {
            out.println("A nota do aluno " + nota + " foi convertida para 'D'.");
        } else if (nota >= 5) {
            out.println("A nota do aluno " + nota + " foi convertida para 'E'");
        } else {
            out.println("O aluno não irá ganhar TORTUGUITA!");
        }

        out.print("\n");

        // ****************************************************************************************************
        // Exercício 6 (Nível Médio - Variáveis - Fatorial):
        out.println("Exercício 6 (Nível Fácil - Variáveis - Fatorial:");
        out.println("Digite um número fatorial: ");
        int Receber = gerarNumeroAleatorio(1, 10);
        // int Receber = scanner.nextInt();
        CalcularFatorial(Receber);

        // ****************************************************************************************************
        // Exercíco Médio 7 - Variáveis - Fatorial):
        out.println("// Exercíco Médio 7 - Variáveis - MAIOR NUMERO):");
        out.println("Digite um número fatorial: ");

        out.print("Digite o 1º número: ");
        int numeromin = scanner.nextInt();
        out.println("O 1º número é " + numeromin + ".");

        out.print("Digite o 2º número: ");
        int numeromax = scanner.nextInt();
        out.println("O 2º número é " + numeromax + ".");


        if (numeromin > numeromax) {
            System.out.println("O maior número é: " + numeromin);
        } else if (numeromin > numeromax) {
            System.out.println("O maior número é: " + numeromax);
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    out.print("\n");
    }
        

    // ******************************************** FUNÇÕES *********************************************
    
    // Exercício 6 (Nível Médio - Variáveis - Fatorial):
    public static void CalcularFatorial(int Numeral) { // Exercício 6 (Nível Médio - Variáveis - Fatorial):
        PrintStream out = System.out;
        int fatorial = 1;

        for (int i = 1; i <= Numeral; i++) {
            /* out.println(i); */
            fatorial = fatorial * i; // ou += soma foi convertida para soma + i
        }

        // printf = printformat chama a variável %d que já é da linguagem (inteiro)
        // variável (fatorial) e o parâmetro (Numero)
        out.println("O número escolhido para ser calculado é " + Numeral + " e seu fatorial é " + fatorial + ".");
        out.printf("O fatorial de %d é " + fatorial, Numeral);
        out.print("\n");
        out.printf("O fatorial do numero " + Numeral + " é " + fatorial);
    }
    


    // ****************************************************************************************************

    // Exercíco Médio 7 - Variáveis - MAIOR NUMERO):

    public static void ExibirMaiorNumero(int MaiorNumero) { // Exercício 7 (Nível Médio - Variáveis - MAIOR NÚMERO):
        // PrintStream out = System.out;




        
        /*
         * Crie um programa em Java que leia dois números e exiba o maior deles.
         * Dica: Leia dois números utilizando a classe Scanner ou a função
         * `JOptionPane.showInputDialog()` e compare-os utilizando uma estrutura
         * condicional `if`. Utilize o operador de comparação `>` para verificar qual
         * número é maior. Utilize o comando `System.out.println()` para exibir o
         * resultado.
         */
    }
}