
package JAVA3;

import java.util.Scanner;
public class testes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetorPalavras = new String[4];
       
        for (int i = 0; i < vetorPalavras.length; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            vetorPalavras[i] = scanner.next();
        }

        System.out.println("Palavras digitadas na ordem:");

        for (int i = 0; i < vetorPalavras.length; i++) {
            System.out.println(vetorPalavras[i]);
        }
        scanner.close();
    }
}