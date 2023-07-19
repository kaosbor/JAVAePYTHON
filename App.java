import java.io.PrintStream; // Importanto a classe  - classe de saída do java (retonará valor)  
import java.util.Scanner;

public class App {
    public static void main(String[] Argumentos) {
        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // Comando de limpar o terminal, somente.
        out.println("Olá Lelê linguiça!");

        float a = 5;
        float b = 10;

        float soma = a + b;
        float subtrai = a - b;
        float multiplica = a * b;
        float divide = a / b;

        out.println("A soma dos números " + soma);
        out.println("A subtração dos números " + subtrai);
        out.println("A multiplicação dos números " + multiplica);
        out.println("A divisão dos números " + divide);

        for (int i = 1; i <= 10; i++) {
            out.println(i);
        }

        for (int i = 1; i <= 10; i=i+2) {
            out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nota número: ");
        double grade = scanner.nextDouble();
        scanner.close();

        if (grade >= 95) {
            out.println("A nota " + grade + " determina a nota do aluno como Excelente!");
        } else if (grade >= 85) {
            out.println("A nota " + grade + " determina a nota do aluno como Muito Boa!");
        } else if (grade >= 75) {
            out.println("A nota " + grade + " determina a nota do aluno como Boa!");
        } else if (grade >= 65) {
            out.println("A nota " + grade + " determina a nota do aluno como Satisfatória!");
        } else if (grade >= 60) {
            out.println("Pode começar a chorar!");
        } else if (grade < 60) {
            out.println("A nota " + grade + " determina que o aluno não vai ganhar a TORTUGUITA!");
        } else {
            out.println("Nota inválida");
        }
    }
}