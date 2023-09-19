package trabalho; // Declaração do pacote

import java.util.Scanner; // Importação da classe Scanner para leitura de entradas do usuário
import java.util.Random; // Importação da classe Random para geração de números aleatórios
import java.io.PrintStream; // Importação da classe PrintStream para saída de texto
import java.util.HashMap; // Importação da classe HashMap para criar um mapa de pontuações
import java.util.Map; // Importação da interface Map para trabalhar com mapas chave-valor

public class trabalho6copy { // Declaração da classe "trabalho6copy"

    // Declaração de constantes
    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "SQL", "HTML", "CSS"};
    private static final int MAX_TENTATIVAS = 6;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final Map<String, Integer> pontuacoes = new HashMap<>();

    public static void main(String[] args) { // Método principal que inicia o programa
        PrintStream out = System.out;

        int escolhaOpcao;

        do {
            // Exibe o menu de opções
            out.println("-------- MENU de OPÇÕES ---------");
            out.println("|-------------------------------|");
            out.println("|----- 1. Iniciar jogo  --------|");
            out.println("|----- 2. Verificar pontuações -|");
            out.println("|----- 3. Sair do jogo ---------|");
            out.println("---------------------------------");

            int inputOption = readIntegerInput("Escolha uma opção de 1 até 3: "); // Lê a opção escolhida pelo usuário
            escolhaOpcao = inputOption; // Atribui a opção escolhida à variável "escolhaOpcao"

            out.print("\n");

            switch (escolhaOpcao) { // Estrutura de decisão baseada na escolha do usuário
                case 1: // Caso a opção seja 1, inicia um novo jogo
                    clearScreen(); // Limpa a tela do console
                    novoJogo(); // Chama o método para iniciar um novo jogo
                    break;
                case 2: // Caso a opção seja 2, exibe as pontuações acumuladas
                    exibirPontuacoes(); // Chama o método para exibir as pontuações
                    break;
                case 3: // Caso a opção seja 3, encerra o jogo
                    out.println("Obrigado por jogar!\n");
                    break;
                default: // Caso a opção seja inválida
                    out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        } while (escolhaOpcao != 3); // Repete o loop enquanto a opção não for 3 (Sair do jogo)
    }

    private static void novoJogo() { // Método para iniciar um novo jogo
        PrintStream out = System.out;

        out.print("Digite seu nome: "); // Solicita o nome do jogador
        String nomeJogador = scanner.nextLine(); // Lê o nome digitado pelo jogador

        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)]; // Escolhe uma palavra aleatória do array

        out.println("Olá, " + nomeJogador + "! O Jogo começou.");

        StringBuilder palavraAdivinhar = new StringBuilder("_".repeat(palavra.length())); // Cria uma string com underscores para a palavra a ser adivinhada

        int vidas = MAX_TENTATIVAS; // Inicializa o número de vidas do jogador

        while (vidas > 0 && palavraAdivinhar.toString().contains("_")) { // Loop principal do jogo
            out.println("Palavra: " + palavraAdivinhar); // Exibe a palavra oculta com letras adivinhadas
            out.println("Vidas restantes: " + vidas); // Exibe o número de vidas restantes
            String input = readStringInput("Digite uma letra: ").toUpperCase(); // Lê a letra digitada pelo jogador

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) { // Verifica se a entrada é válida
                out.println("Entrada inválida. Digite apenas uma letra.");
                continue; // Volta para o início do loop
            }

            char letra = input.charAt(0); // Obtém a letra digitada pelo jogador
            boolean acertouLetra = false;

            for (int i = 0; i < palavra.length(); i++) { // Verifica se a letra está presente na palavra
                if (palavra.charAt(i) == letra) { // Se a letra está na palavra
                    palavraAdivinhar.setCharAt(i, letra); // Substitui o underscore pela letra correta
                    acertouLetra = true; // Define que a letra foi acertada
                }
            }

            if (!acertouLetra) { // Se a letra não foi acertada
                vidas--; // Decrementa o número de vidas
            }
        }

        if (palavraAdivinhar.toString().equals(palavra)) { // Se a palavra foi completamente adivinhada
            out.println("Parabéns, " + nomeJogador + "! Você adivinhou a palavra.");
            salvarPontuacao(nomeJogador); // Chama o método para salvar a pontuação do jogador
        } else { // Se o jogador não adivinhou a palavra
            out.println("Você perdeu, " + nomeJogador + "! A palavra era: " + palavra);
            salvarPontuacao(nomeJogador); // Chama o método para salvar a pontuação do jogador
        }
    }

    private static void salvarPontuacao(String jogador) { // Método para salvar a pontuação do jogador
        PrintStream out = System.out;
        int pontos = pontuacoes.getOrDefault(jogador, 0) + 1; // Obtém a pontuação atual do jogador e incrementa
        pontuacoes.put(jogador, pontos); // Atualiza a pontuação do jogador no mapa
        out.println("Pontuação salva com sucesso para " + jogador + "!");
    }

    private static void exibirPontuacoes() { // Método para exibir as pontuações acumuladas
        PrintStream out = System.out;
        out.println("PONTUAÇÕES:\n");
        for (Map.Entry<String, Integer> entry : pontuacoes.entrySet()) { // Percorre as entradas do mapa de pontuações
            out.println("O Jogador " + entry.getKey() + " acumulou " + entry.getValue() + " pontos.");
        }

        out.println("\n");
    }

    private static int readIntegerInput(String message) { // Método para ler uma entrada inteira do usuário
        PrintStream out = System.out;
        int input = 0; // Inicializa a variável de entrada
        boolean validInput = false; // Define uma flag para verificar a validade da entrada

        while (!validInput) { // Loop até que a entrada seja válida
            try {
                out.print(message); // Exibe a mensagem de entrada
                input = Integer.parseInt(scanner.nextLine()); // Lê a entrada como um número inteiro
                validInput = true; // Define a flag como verdadeira, indicando que a entrada é válida
            } catch (NumberFormatException e) { // Captura a exceção caso a entrada não seja um número válido
                out.println("Entrada inválida. Digite um número válido.");
            }
        }

        return input; // Retorna o valor inteiro lido
    }

    private static String readStringInput(String message) { // Método para ler uma entrada de string do usuário
        PrintStream out = System.out;
        out.print(message); // Exibe a mensagem de entrada
        return scanner.nextLine(); // Lê a entrada como uma string e a retorna
    }

    private static void clearScreen() { // Método para limpar a tela do console
        System.out.print("\033[h\033[2J"); // Código ANSI para limpar a tela
    }
}


