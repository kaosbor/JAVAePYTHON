/* 1. Exercício - Contagem de Palavras:
Crie um programa que leia uma string do usuário e conte quantas vezes cada palavra aparece. Use um HashMap para armazenar as palavras e suas contagens.*/

import java.io.PrintStream;
import java.util.*;

public class ContagemPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");

        HashMap<String, Integer> contagem = new HashMap<>();
        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        for (String palavra : contagem.keySet()) {
            out.println(palavra + ": " + contagem.get(palavra));
        }
    }

    public class App {
        public static void main(String[] args) throws Exception {
            PrintStream out = System.out;
            
            out.println("Hello, World!");
        }
    }

}