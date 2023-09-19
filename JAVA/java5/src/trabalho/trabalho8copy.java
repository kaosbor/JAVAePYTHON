/* >>> Informações gerais <<<
Título: Exercícios de Java - Preparação para o trabalho 2 (11/08/2023). Autor: RB. Date: 18/08/2023.
Instituição: Senai. Curso: Desenvolvimento em Sistemas. Exercícios: 01 a 12. */

/* Trabalho 1:
Você foi contratado como desenvolvedor(a) para criar um Jogo da Forca em Java para auxiliar estudantes no aprendizado de palavras e vocabulário. O jogo deverá ser implementado em modo texto (console) e seguir as seguintes especificações:*/

package trabalho; // Pacote onde a classe está localizada

// Importação das classes necessárias
import java.util.Scanner; // Permite a leitura de entradas do usuário
import java.util.Random; // Gera números aleatórios
import java.io.PrintStream; // Fornece funcionalidade de saída no console
import java.util.HashMap; // Classe que implementa a interface Map para armazenar pares chave-valor, usada para criar um tipo de estrutura de dados conhecida como "mapa" ou "dicionário".
import java.util.Map; // Interface que define operações em pares chave-valor. Em Java, uma interface é uma espécie de contrato que define um conjunto de métodos que uma classe concreta (uma classe que implementa essa interface) deve implementar,sendo a interface java.util.Map uma dessas interfaces usada para representar estruturas de dados que armazenam pares chave-valor.

public class trabalho8copy {
    private static final String[] PALAVRAS = { "JAVA", "PYTHON", "SQL", "HTML", "CSS" }; // Array de palavras para o
                                                                                         // jogo.
    private static final int MAX_TENTATIVAS = 6; // Número máximo de tentativas permitidas.
    private static final Scanner scanner = new Scanner(System.in); // Objeto Scanner para entrada do usuário.
    private static final Random random = new Random(); // Objeto Random para gerar números aleatórios.
    private static final Map<String, Integer> pontuacoes = new HashMap<>(); // Mapa para armazenar as pontuações.
    private static final Map<String, Integer> derrotas = new HashMap<>(); // Mapa que armazena o número de derrotas.

    public static void main(String[] args) {
        PrintStream out = System.out; // Objeto para lidar com saída no console
        int escolhaOpcao; // Variável para armazenar a opção escolhida pelo usuário

        do {
            out.println("-------- MENU de OPÇÕES ---------"); // Exibição do cabeçalho do menu
            out.println("|-------------------------------|"); // Linha de formatação
            out.println("|----- 1. Iniciar jogo  --------|"); // Exibição opção: Iniciar jogo
            out.println("|----- 2. Verificar pontuações -|"); // Exibição opção: Verificar pontuações
            out.println("|----- 3. Sair do jogo ---------|"); // Exibição opção: Sair do jogo
            out.println("---------------------------------"); // Linha de formatação

            // Leitura da opção escolhida pelo usuário
            int inputOption = readIntegerInput("Escolha uma opção de 1 até 3: ");
            escolhaOpcao = inputOption; // Atribuição da opção escolhida à variável escolhaOpcao

            out.print("\n"); // Impressão de uma linha em branco para separação visual

            switch (escolhaOpcao) { // Estrutura de decisão com base na opção escolhida pelo usuário
                case 1:
                    clearScreen(); // Limpa a tela do console.
                    novoJogo(); // Chama o método para iniciar um novo jogo.
                    break;
                case 2:
                    exibirPontuacoes(); // Chama o método para exibir as pontuações.
                    break;
                case 3:
                    out.println("Você está saindo do jogo!3"); // Mensagem de saída - agradecendo.
                    out.println("Esperamos você de volta em breve!\n"); // Mensagem de saída - agradecendo.
                    break;
                default:
                    out.println("Opção inválida. Tente novamente.\n"); // Mensagem para opção inválida
                    break;
            }
        } while (escolhaOpcao != 3); // O loop continua até a opção 3 ser escolhida (sair do jogo)
    }

    private static void novoJogo() {
            PrintStream out = System.out; // Objeto para lidar com saída no console
        
            out.print("Digite seu nome: "); // Solicitação para o jogador digitar seu nome
            String nomeJogador = scanner.nextLine(); // Leitura do nome do jogador a partir da entrada do usuário
        
            String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)]; // Escolha aleatória de uma palavra do array PALAVRAS
        
            out.println("Olá, " + nomeJogador + "! O Jogo começou."); // Mensagem de boas-vindas ao jogador
        
            // Criação de uma string com "_" para cada letra da palavra a ser adivinhada
            StringBuilder palavraAdivinhar = new StringBuilder("_".repeat(palavra.length()));
        
            int vidas = MAX_TENTATIVAS; // Inicialização do número de vidas com o valor máximo
    
            while (vidas > 0 && palavraAdivinhar.toString().contains("_")) {
                out.println("Palavra: " + palavraAdivinhar); // Exibe a palavra oculta com letras adivinhadas
                out.println("Vidas restantes: " + vidas); // Exibe o número de vidas restantes
                String input = readStringInput("Digite uma letra: ").toUpperCase(); // Solicitação para que digite uma letra e a converte para maiúscula
            
                // Verifica se a entrada é inválida (não é uma única letra)
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    out.println("Entrada inválida. Digite apenas uma letra."); // Mensagem de erro para entrada inválida.
                    continue; // Pula para a próxima iteração do loop
                }
            
                char letra = input.charAt(0); // Extrai a letra da entrada
                boolean acertouLetra = false; // Variável para controlar se a letra foi acertada
            
                // Verifica se a letra adivinhada está presente na palavra
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        palavraAdivinhar.setCharAt(i, letra); // Substitui "_" pela letra adivinhada
                        acertouLetra = true; // Define a variável de acerto como true
                    }
                }
            
                // Se a letra não foi acertada, diminui o número de vidas
                if (!acertouLetra) {
                    vidas--; // Reduz o número de vidas
                }
            }

            if (palavraAdivinhar.toString().equals(palavra)) {
                out.println("Parabéns, " + nomeJogador + "! Você adivinhou a palavra."); // Mensagem de vitória
                salvarPontuacao(nomeJogador); // Chama o método para salvar a pontuação do jogador
            } else {
                out.println("Você perdeu, " + nomeJogador + "! A palavra era: " + palavra); // Mensagem de derrota
                salvarDerrota(nomeJogador); // Chama o método para registrar a derrota do jogador
            }
        }

    private static void salvarPontuacao(String jogador) {
        PrintStream out = System.out; // Cria uma referência para a saída padrão
        int pontos = pontuacoes.getOrDefault(jogador, 0) + 1; // Obtém os pontos do jogador ou 0 se não houver, e
                                                              // incrementa 1
        pontuacoes.put(jogador, pontos); // Atualiza os pontos do jogador no mapa de pontuações
        out.println("Pontuação salva com sucesso para " + jogador + "!"); // Imprime uma mensagem de sucesso
    }

    private static void salvarDerrota(String jogador) {
        PrintStream out = System.out; // Cria uma referência para a saída padrão
        int derrotasJogador = derrotas.getOrDefault(jogador, 0) + 1; // Obtém as derrotas do jogador ou 0 se não houver,
                                                                     // e incrementa 1
        derrotas.put(jogador, derrotasJogador); // Atualiza as derrotas do jogador no mapa de derrotas
        out.println("Derrota registrada com sucesso para " + jogador + "!"); // Imprime uma mensagem de sucesso
    }

    private static void exibirPontuacoes() {
        PrintStream out = System.out; // Cria uma referência para a saída padrão
        out.println("PONTUAÇÕES:\n"); // Imprime um cabeçalho para a seção de pontuações
        for (Map.Entry<String, Integer> entry : pontuacoes.entrySet()) {
            out.println("O jogador " + entry.getKey() + " acumulou um total de " + entry.getValue() + " vitória(s) e "
                    + derrotas.getOrDefault(entry.getKey(), 0) + " derrota(s)."); // Exibe as vitórias e derrotas do
                                                                                  // jogador
        }
// *********** fazer if fazerif

        out.println("\n"); // Imprime uma linha em branco após a exibição das pontuações.
    }

    // Métodos readIntegerInput, readStringInput e clearScreen permanecem iguais...

    private static int readIntegerInput(String message) {
        // Método para ler uma entrada inteira do usuário.
        PrintStream out = System.out; // Cria uma referência para a saída padrão.
        int input = 0; // Variável para armazenar a entrada inteira.
        boolean validInput = false; // Variável de controle para verificar se a entrada é válida.

        while (!validInput) { // Loop enquanto a entrada não for válida.
            try {
                out.print(message); // Imprime a mensagem para solicitar a entrada.
                input = Integer.parseInt(scanner.nextLine()); // Lê a entrada do usuário e a converte para inteiro.
                validInput = true; // Define a flag como verdadeira para sair do loop.
            } catch (NumberFormatException e) {
                out.println("Entrada inválida. Digite um número válido."); // Imprime mensagem de erro se a conversão falhar.
            }
        }

        return input; // Retorna a entrada válida
    }

    private static String readStringInput(String message) {
        // Método para ler uma entrada de string do usuário.
        PrintStream out = System.out; // Cria uma referência para a saída padrão.
        out.print(message); // Imprime a mensagem para solicitar a entrada.
        return scanner.nextLine(); // Lê e retorna a entrada de string do usuário.
    }

    private static void clearScreen() {
        // Método para limpar a tela do console
        System.out.print("\033[h\033[2J"); // Envia sequência de controle para limpar a tela
    }

}