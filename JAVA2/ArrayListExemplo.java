package JAVA2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExemplo {

    public static void main(String[] args) {

        PrintStream out = System.out;
        out.println("\033[h\033[2J"); // LIMPA A TELA
        
        List<String> fruits = new ArrayList<>();

        fruits.add("Maça - Apple");
        fruits.add("Banana - Banana");
        fruits.add("Laranja - Orange");
        fruits.add("Abacaxi - Pineapple");
        fruits.add("Pêra - Pear");

    out.println("\nTamanho do ArrayList: " + fruits.size() + "\n");
    out.println("Primeiro Elemento: " + fruits.get(0));
    out.println("Elemento do meio: " + fruits.get(fruits.size() - 3));
    out.println("Último Elemento: " + fruits.get(fruits.size() - 1) + "\n");
    
        for (String fruit : fruits) {
            out.println(fruit);
        }
    }
}