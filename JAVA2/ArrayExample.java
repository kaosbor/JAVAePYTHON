package java2;

import java.io.PrintStream;

public class ArrayExample {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA

    // Declaração e inicialização de um Array 
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    // Acessando elemetos do Array
    out.println("Primeiro elemento: " + numbers[0]);
    out.println("Tamanho do ARRAY: " + numbers.length);

    // Percorrendo e imprimindo todos os elementos do Array
    for (int i = 0; i < numbers.length; i++) {
        out.print(numbers[i] + " ");
        }     
    }
}