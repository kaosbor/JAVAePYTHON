package trabalho;

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class trabalho5copy {

    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "SQL", "HTML", "CSS"};
    private static final int MAX_TENTATIVAS = 6;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final Map<String, Integer> pontuacoes = new HashMap<>();

    public static void main(String[] args) {
        PrintStream out = System.out;

        int escolhaOpcao;

        do {
            out.println("-------- MENU de OPÇÕES ---------");
            out.println("|-------------------------------|");
            out.println("|----- 1. Iniciar jogo  --------|");
            out.println("|----- 2. Verificar pontuações -|");
            out.println("|----- 3. Sair do jogo ---------|");
            out.println("---------------------------------");

            int inputOption = readIntegerInput("Escolha uma opção de 1 até 3: ");
            escolhaOpcao = inputOption;

            out.print("\n");

            switch (escolhaOpcao) {
                case 1:
                    clearScreen();
                    novoJogo();
                    break;
                case 2:
                    exibirPontuacoes();
                    break;
                case 3:
                    out.println("Obrigado por jogar!\n");
                    break;
                default:
                    out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        } while (escolhaOpcao != 3);
    }

    private static void novoJogo() {
        PrintStream out = System.out;

        out.print("Digite seu nome: ");
        String nomeJogador = scanner.nextLine();

        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)];

        out.println("Olá, " + nomeJogador + "! O Jogo começou.");

        StringBuilder palavraAdivinhar = new StringBuilder("_".repeat(palavra.length()));

        int vidas = MAX_TENTATIVAS;

        while (vidas > 0 && palavraAdivinhar.toString().contains("_")) {
            out.println("Palavra: " + palavraAdivinhar);
            out.println("Vidas restantes: " + vidas);
            String input = readStringInput("Digite uma letra: ").toUpperCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                out.println("Entrada inválida. Digite apenas uma letra.");
                continue;
            }

            char letra = input.charAt(0);
            boolean acertouLetra = false;

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    palavraAdivinhar.setCharAt(i, letra);
                    acertouLetra = true;
                }
            }

            if (!acertouLetra) {
                vidas--;
            }
        }

        if (palavraAdivinhar.toString().equals(palavra)) {
            out.println("Parabéns, " + nomeJogador + "! Você adivinhou a palavra.");
            salvarPontuacao(nomeJogador);
        } 
            else {
                out.println("Você perdeu, " + nomeJogador + "! A palavra era: " + palavra);
                salvarPontuacao(nomeJogador);
        }
    }

    private static void salvarPontuacao(String jogador) {
        PrintStream out = System.out;
        int pontos = pontuacoes.getOrDefault(jogador, 0) + 1;
        pontuacoes.put(jogador, pontos);
        out.println("Pontuação salva com sucesso para " + jogador + "!");
    }

    private static void exibirPontuacoes() {
        PrintStream out = System.out;
        out.println("PONTUAÇÕES:\n");
        for (Map.Entry<String, Integer> entry : pontuacoes.entrySet()) {
            out.println("O Jogador " + entry.getKey() + " acumulou " + entry.getValue() + " pontos.");
        }

        out.println("\n");
    }

    private static int readIntegerInput(String message) {
        PrintStream out = System.out;
        int input = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                out.print(message);
                input = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                out.println("Entrada inválida. Digite um número válido.");
            }
        }
        
        return input;
    }

    private static String readStringInput(String message) {
        PrintStream out = System.out;
        out.print(message);
        return scanner.nextLine();
    }

    private static void clearScreen() {
        System.out.print("\033[h\033[2J"); // Limpa a tela
    }
}
