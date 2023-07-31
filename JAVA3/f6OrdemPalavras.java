

package JAVA3;

import java.io.PrintStream;
import java.util.Scanner;

public class f6OrdemPalavras {
    
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] vetorPalavras = new String[4];

        PrintStream out = System.out;
        System.out.println("\033[h\033[2J"); // LIMPA A TELA

        for (int i = 0; i < vetorPalavras.length; i++) {
            out.print("Digite um nome " + (i + 1) + ": " );
            vetorPalavras[i] = scanner.next();
        }

        out.println("Palavras digitadas ma ordem:");

        for (int i = 0; i < vetorPalavras.length; i++) {
            out.println("A ordem da palavra '" + vetorPalavras[i] + "' digitada é " + (i + 1) + "." );
        }           

out.println("\n");

        System.out.println("Palavras digitadas na ordem:");
        for (int i = 0; i < vetorPalavras.length; i++) {
            System.out.println(vetorPalavras[i]);
        }

        scanner.close();
    }
}