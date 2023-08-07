import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SorteioDeBrindes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n* * * EXERCÍCIO 15 - SORTEIO DE BRINDES * * *\n");
        System.out.println("> > > SORTEIO DE 3 CONVIDADOS < < <");

        System.out.print("Quantos convidados participarão do sorteio? ");
        int NrConvidados = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

        List<String> NomeConvidados = new ArrayList<>();

        for (int i = 0; i < NrConvidados; i++) {
            System.out.print("Digite o nome do convidado " + (i + 1) + ": ");
            NomeConvidados.add(scanner.nextLine());
        }

        // Embaralhar a lista de convidados usando o algoritmo de Fisher-Yates
        Random random = new Random();
        for (int i = NomeConvidados.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = NomeConvidados.get(i);
            NomeConvidados.set(i, NomeConvidados.get(j));
            NomeConvidados.set(j, temp);
        }

        List<String> sorteados = NomeConvidados.subList(0, Math.min(3, NomeConvidados.size()));

        System.out.println("\nOs 3 sorteados são:");
        for (int i = 0; i < sorteados.size(); i++) {
            System.out.println((i + 1) + ". " + sorteados.get(i));
        }
    }
}
