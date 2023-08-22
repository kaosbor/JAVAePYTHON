package trabalho;

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class trabalho2 {

    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "CPLUSPLUS", "PROGRAMACAO", "DESENVOLVIMENTO"};

    PrintStream out = System.out;

    private static final int MAX_TENTATIVAS = 6;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static Set<String> jogadores = new HashSet<>();
    private static List<Integer> pontuacoes = new ArrayList<>();

    public static void main(String[] args) {

        PrintStream out = System.out;

        int EscolhaOpcao;
        do {
            // Menu de opções
            out.println("-------- MENU de OPÇÕES ---------");
            out.println("|-------------------------------|");
            out.println("|----- 1. Iniciar jogo  --------|");
            out.println("|----- 2. Verificar pontuações -|");
            out.println("|----- 3. Sair do jogo ---------|");
            out.println("---------------------------------");
            out.print("Escolha uma opção de 1 até 3: ");
            EscolhaOpcao = scanner.nextInt();
            out.print("\n");

            switch (EscolhaOpcao) {
                case 1:
                    novoJogo();
                    break;
                case 2:
                    exibirPontuacoes();
                    break;
                case 3:
                    out.println("Obrigado por jogar!\n");
                    break;
                default:
                    out.println("Opção inválida. Escolha novamente.\n");
            }
        } while (EscolhaOpcao != 3);
    }

    private static void novoJogo() {
        PrintStream out = System.out;
        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)];

        int vidas = MAX_TENTATIVAS;

        out.println("O Jogo começou, você terá direito a " + MAX_TENTATIVAS + " tentativas.");

        StringBuilder PalavraAdivinhar = new StringBuilder("_".repeat(palavra.length()));

        while (vidas > 0 && PalavraAdivinhar.toString().contains("_")) {
            out.println("Palavra: " + PalavraAdivinhar);
            out.println("Vidas restantes: " + vidas);
            out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            if (!Character.isLetter(letra)) {
                out.println("Entrada inválida. Digite apenas letras.");
                continue;
            }

            if (palavra.indexOf(letra) == -1) {
                vidas--;
            } else {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        PalavraAdivinhar.setCharAt(i, letra);
                    }
                }
            }
        }

        if (vidas == 0) {
            out.println("Você perdeu! A palavra era: " + palavra);
        } else {
            String nomeJogador;
            do {
                out.print("Digite seu nome para salvar sua pontuação: ");
                nomeJogador = scanner.next();
                
                if (jogadores.contains(nomeJogador)) {
                    out.println("O nome de usuário já existe, digite outro diferente.");
                    
                }
            } while (jogadores.contains(nomeJogador));

            salvarPontuacao(nomeJogador, vidas);
        }
    }

    private static void salvarPontuacao(String jogador, int vidas) {
        PrintStream out = System.out;
        jogadores.add(jogador);
        pontuacoes.add(vidas);
        out.println("Pontuação salva com sucesso!");
    }

    private static void exibirPontuacoes() {
        PrintStream out = System.out;
        out.println("PONTUAÇÕES:");
        for (int i = 0; i < jogadores.size(); i++) {
            out.println(jogadores.toArray()[i] + ": " + pontuacoes.get(i) + " vidas restantes");
        }
    }
}