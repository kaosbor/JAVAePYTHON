package trabalho;

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class trabalho2copy {

    // Array de palavras para o jogo
    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "CPLUSPLUS", "PROGRAMACAO", "DESENVOLVIMENTO"};

    // Número máximo de tentativas permitidas
    private static final int MAX_TENTATIVAS = 6;

    // Instâncias para entrada de dados, geração aleatória e armazenamento de pontuações
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static Map<String, Integer> pontuacoes = new HashMap<>();

    // Função principal onde o programa começa a execução
    public static void main(String[] args) {

        PrintStream out = System.out;

        int escolhaOpcao;
        do {
            // Menu de opções exibido ao usuário
            out.println("-------- MENU de OPÇÕES ---------");
            out.println("|-------------------------------|");
            out.println("|----- 1. Iniciar jogo  --------|");
            out.println("|----- 2. Verificar pontuações -|");
            out.println("|----- 3. Sair do jogo ---------|");
            out.println("---------------------------------");
            out.print("Escolha uma opção de 1 até 3: ");
            try {
                escolhaOpcao = Integer.parseInt(scanner.nextLine()); // Lê a opção escolhida pelo usuário
            } catch (NumberFormatException e) {
                out.println("Opção inválida. Encerrando o jogo.");
                break;
            }
            out.print("\n");

            switch (escolhaOpcao) {
                case 1:
                    novoJogo(); // Inicia um novo jogo
                    break;
                case 2:
                    exibirPontuacoes(); // Exibe as pontuações
                    break;
                case 3:
                    out.println("Obrigado por jogar!\n"); // Encerra o jogo
                    break;
                default:
                    out.println("Opção inválida. Escolha novamente.\n"); // Opção inválida
            }
        } while (escolhaOpcao != 3); // Repete o menu até que a opção 3 seja escolhida
    }

    // Função para iniciar um novo jogo
    private static void novoJogo() {
        PrintStream out = System.out;

        out.print("Digite seu nome: ");
        String nomeJogador = scanner.nextLine(); // Lê o nome do jogador

        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)]; // Escolhe uma palavra aleatória

        out.println("Olá, " + nomeJogador + "! O Jogo começou.");

        StringBuilder palavraAdivinhar = new StringBuilder("_".repeat(palavra.length())); // Cria o espaço para a palavra a adivinhar

        int vidas = MAX_TENTATIVAS; // Inicializa o número de vidas

        while (vidas > 0 && palavraAdivinhar.toString().contains("_")) {
            out.println("Palavra: " + palavraAdivinhar);
            out.println("Vidas restantes: " + vidas);
            out.print("Digite uma letra: ");
            String input = scanner.nextLine().toUpperCase();

            // Valida se a entrada é uma única letra
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                out.println("Entrada inválida. Digite apenas uma letra.");
                continue;
            }

            char letra = input.charAt(0);
            boolean acertouLetra = false;

            // Itera sobre a palavra para verificar se a letra está correta
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    palavraAdivinhar.setCharAt(i, letra);
                    acertouLetra = true;
                }
            }

            // Decrementa o número de vidas caso a letra não seja encontrada
            if (!acertouLetra) {
                vidas--;
            }
        }

        // Verifica se o jogador adivinhou a palavra ou não e exibe mensagem correspondente
        if (palavraAdivinhar.toString().equals(palavra)) {
            out.println("Parabéns, " + nomeJogador + "! Você adivinhou a palavra.");
            salvarPontuacao(nomeJogador); // Salva a pontuação do jogador
        } else {
            out.println("Você perdeu, " + nomeJogador + "! A palavra era: " + palavra);
        }
    }

    // Função para salvar a pontuação do jogador
    private static void salvarPontuacao(String jogador) {
        int pontos = pontuacoes.getOrDefault(jogador, 0) + 1; // Calcula os pontos do jogador
        pontuacoes.put(jogador, pontos); // Armazena os pontos do jogador
        System.out.println("Pontuação salva com sucesso para " + jogador + "!");
    }

    // Função para exibir as pontuações dos jogadores
    private static void exibirPontuacoes() {
        PrintStream out = System.out;
        out.println("PONTUAÇÕES:");
        for (Map.Entry<String, Integer> entry : pontuacoes.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue() + " pontos");
        }
    }
}
