package java52;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        String[] palavrasSecreta = {"JAVA", "PYTHON", "CPLUSPLUS", "JAVASCRIPT", "RUBY", "PHP"};
        String palavraSecreta = escolherPalavraAleatoria(palavrasSecreta);

        int vidas = 6 ; // De 0 a 5 = 6
        char[] NovaLetra = new char[palavraSecreta.length()];
        for (int i = 0; i < NovaLetra.length; i++) {
            NovaLetra[i] = '_';
        }

        while (vidas > 0) {
            out.println("\nPalavra atual: " + new String(NovaLetra) + "\n");
            out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean RecebeLetra = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    NovaLetra[i] = letra;
                    RecebeLetra = true;
                }
            }

            if (!RecebeLetra) {
                vidas--;
                out.println("A letra '" + letra + "' NÃO existe na palavra! Vidas restantes: " + vidas);
            }

            if (palavraCompleta(NovaLetra)) {
                out.println("Parabéns, você acertou a palavra: " + palavraSecreta);
                break;
            }
        }

        if (vidas == 0) {
            out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }

    public static String escolherPalavraAleatoria(String[] palavras) {
        Random random = new Random();
        int indice = random.nextInt(palavras.length);
        return palavras[indice];
    }

    public static boolean palavraCompleta(char[] NovaLetra) {
        for (char letra : NovaLetra) {
            if (letra == '_') {
                return false;
            }
        }
        return true;
    }
}
