import java.io.PrintStream;
import java.util.*; 

public class Contador {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        out.print("Digite uma frase para ser contada: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.split("");

        HashMap<String, Integer> contagem = new HashMap<>(0, 0);
        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra,0) + 1);
        }

        for (String palavra : contagem.keySet()) {
            out.println(palavra + ": " + contagem.get(palavra));
        }
    }

        public class App {
            public static void main(String[] args) throws Exception {
                PrintStream out = System.out;
                out.println();
            }
        }
}