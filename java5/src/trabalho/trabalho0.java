package trabalho;

/* Trabalho 1:
Você foi contratado como desenvolvedor(a) para criar um Jogo da Forca em Java para auxiliar estudantes no aprendizado de palavras e vocabulário. O jogo deverá ser implementado em modo texto (console) e seguir as seguintes especificações:*/

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class trabalho0 {

    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "CPLUSPLUS", "PROGRAMACAO", "DESENVOLVIMENTO"};
    
    PrintStream out = System.out;
    
    private static final int MAX_TENTATIVAS = 6; // Número máximo de tentativas
    
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static List<String> jogadores = new ArrayList<>();
    private static List<Integer> pontuacoes = new ArrayList<>();
    
    public static void main(String[] args) {
        
        PrintStream out = System.out;

        int EscolhaOpcao;
        do {
            // Menu de opções de 1 a 3 seguido da opção escolhida com o retonro em EscolhaOpcao = scanner.nextInt();
            out.println("-------- MENU de OPÇÕES ---------");
            out.println("|-------------------------------|");
            out.println("|----- 1. Iniciar jogo  --------|");
            out.println("|----- 2. Verificar pontuações -|");
            out.println("|----- 3. Sair do jogo ---------|");
            out.println("---------------------------------");
            out.print("Escolha uma opção de 1 até 3: ");
            EscolhaOpcao = scanner.nextInt();// Neste momento é escolhida a opção de 1 a 3
            out.print("\n");
            
            switch (EscolhaOpcao) { // Switch é uma estrutura de controle que avala um valor e execute um bloco de código com base em diferentes casos desse valor (switch = trocar), a exppressão "EscolhaOpcao" cujo valor será avaliado para determinar qual bloco de código será, case 1: até case: 3.  
                case 1:         // Caso digite 1 um jogo se iniciará.
                    novoJogo(); 
                    break;      // Após a execução do código dentro de um case vem a instrução break para sair do bloco switch, evitando erros e loops.
                case 2:         // Caso digite 2 serão verificadas as pontuações.
                    exibirPontuacoes(); 
                    break;      // Após a execução do código dentro de um case vem a instrução break para sair do bloco switch, evitando erros e loops.
                case 3:
                    out.println("Obrigado por jogar!\n"); // Caso 3, o jogo terminará e será exibida a mensagem "Obrigado por jogar!".
                    break;      // Após a execução do código dentro de um case vem a instrução break para sair do bloco switch, evitando erros e loops.
                default: out.println("Opção inválida. Escolha novamente.\n"); // Caso opcional, executado se nenhum dos valores dos case acima, corresponder ao valor de EscolhaOpcao. É uma espécie de "else" para lidar com situações não previstas.
            }
        } while (EscolhaOpcao != 3); // While (enquanto) é uma estrutura de controle de fluxo que permite repetir um bloco de código enquanto uma condição especificada for verdadeira, no caso EscolhaOpcao != 3: e verifica se EscolhaOpcao é diferente de 3.
    }
    
    private static void novoJogo() {
        PrintStream out = System.out;
        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)];
        
        int vidas = MAX_TENTATIVAS;
        
        out.println("O Jogo começou, você terá direito a " + MAX_TENTATIVAS + " tentativas."); // Aqui demonstra de forma direta a quantidade de tentativas.
        
        StringBuilder PalavraAdivinhar = new StringBuilder("-".repeat(palavra.length())); // A variável "PalavraAdivinhar" armazena um objeto StringBuilder inicializado com sublinhados usando o método repeat(palavra.length()). Isso cria uma base de sublinhados do mesmo tamanho da palavra. O StringBuilder pode ser modificado para formar a representação da palavra com sublinhados. Um loop FOR também poderia ser utilizado em vez do método REPEAT.
        
        // Resumo: o loop continua enquanto houver vidas e letras não adivinhadas, e a cada iteração (quando um loop é executado, isso é chamado de iteração, quando um ciclo completo é executado dentro de um loop), mostra a palavra, vidas e pede uma letra. O programa espera a entrada do usuário para adivinhar.
        while (vidas > 0 && PalavraAdivinhar.toString().contains("-")) { // O loop "while" continua a execução do código entre as chaves enquanto as duas condições são verdadeiras: "vidas" > 0 (jogador tem vidas restantes) e a representação em string da "PalavraAdivinhar" contém pelo menos um sublinhado "_". Método toString() obtém a string atual da palavra, e o método contains("_") verifica se há sublinhados na palavra (letras não adivinhadas). O loop continua enquanto houver letras não adivinhadas na palavra.
        out.println("Palavra: " + PalavraAdivinhar); // Imprime a representação atual da palavra, com letras adivinhadas corretamente e espaços vazios para letras não adivinhadas.
        out.println("Vidas restantes: " + vidas); // Imprime o número de vidas restantes.
        out.print("Digite uma letra: "); // Imprime mensagem para o usuário, para que digite uma letra. 
        char letra = scanner.next().toUpperCase().charAt(0); // A entrada do usuário é obtida através de um objeto Scanner e a primeira letra é convertida para maiúscula, sendo armazenada na variável "letra".
        
        // Resumo: esse trecho de código verifica se a entrada do usuário (a variável letra) não é uma letra do alfabeto e se não for, uma mensagem de erro é exibida, sendo a iteração atual do loop interrompida, dando ao usuário uma nova oportunidade de inserir uma entrada válida.        
            if (!Character.isLetter(letra)) { // O método estático Character.isLetter() verifica se um caractere é uma letra do alfabeto, se for uma letra (true) e caso contrário (false). O operador ! (negação) inverte o resultado do método. A classe Character faz parte da biblioteca padrão do Java (java.lang.Character), sendo automática, sem a necessidade de import.

                out.println("Entrada inválida. Digite apenas letras."); // Se o caractere não for uma letra, imprime uma mensagem de erro (entrada é inválida).
                continue; // O uso de "continue" (palavra-chave) interrompe a iteração atual do loop e passa para a próxima. No contexto, se a entrada do usuário não for uma letra, a mensagem de erro é exibida, e o loop segue para a próxima iteração. Isso permite que o usuário insira uma entrada válida novamente.
            }
            
                // Resumo: verifica se a letra do usuário não está na palavra. Se não estiver, diminui as vidas.
                if (palavra.indexOf(letra) == -1) { // Verifica se letra não está em palavra (palavra.indexOf(letra) == -1).
                vidas--; // Se letra não estiver na palavra (palavra.indexOf(letra) retornou -1), decrementa vidas.
                } 
                // Resumo: o bloco else (outro) ocorre quando a letra do usuário está na palavra. Ele percorre as posições, atualiza PalavraAdivinhar para exibir a letra nas posições certas, fornecendo feedback da adivinhação correta.
                else { // Quando a letra está na palavra (tentativa correta), este bloco de código é executado.
                    for (int i = 0; i < palavra.length(); i++) { // Loop do LAÇO "for" verifica a presença da letra em cada posição da string "palavra".
                    if (palavra.charAt(i) == letra) { // O código verifica se o caractere na posição "i" da string "palavra" é == à letra do usuário.
                        PalavraAdivinhar.setCharAt(i, letra); // Se a letra estiver na posição "i" da palavra, o código atualiza a string "PalavraAdivinhar" (== a palavra a ser adivinhada), substituindo o espaço vazio/sublinhado (indicando uma letra não adivinhada) pela letra, e revela as letras corretamente adivinhadas.
                    }
                 }
            }
        }

        if (vidas == 0) { // // Verifica se o número de vidas chegou a zero, indicando que o jogador perdeu, se vidas se igualar a 0 (vidas == 0). 
            out.println("Você perdeu! A palavra era: " + palavra); // Exibe uma mensagem informando que o jogador perdeu, mostrando também a palavra correta.
        } else {
            String nomeJogador; // Variável para armazenar o nome do jogador.
            do { // Loop "do-while" que solicita o nome do jogador até que um nome único seja fornecido.
                out.print("Digite seu nome para salvar sua pontuação: "); // Mensagem solicitando que digite seu nome para salvar a pontuação.
                nomeJogador = scanner.next(); // Lê/recebe a entrada do jogador e armazena na variável "nomeJogador".
                if (jogadores.contains(nomeJogador)) { // Verifica se o nome do jogador já existe na lista de jogadores.
                    out.println("O nome de usuário já existe, digite outro diferente."); // Se existir, exibe mensagem "o nome de usuário já existe".
                }
            } while (jogadores.contains(nomeJogador)); // O loop continua enquanto o nome de jogador já existir, para que seja digitado um novo e o loop termine.
            salvarPontuacao(nomeJogador, vidas); // Após obter um nome que não existe, chama a função para salvar a pontuação do jogador.
        }

    }
    
    // Essa função é responsável por salvar o nome do jogador e o número de vidas associado a essa pontuação nas listas correspondentes. Ela também exibe uma mensagem para informar que a pontuação foi salva com sucesso.
    private static void salvarPontuacao(String jogador, int vidas) { // Função para salvar a pontuação do jogador.
        PrintStream out = System.out; // Criação de um objeto PrintStream para a saída padrão.
        jogadores.add(jogador); // Adiciona o nome do jogador à lista de jogadores.
        pontuacoes.add(vidas); // Adiciona o número de vidas à lista de pontuações.
        out.println("Pontuação salva com sucesso!"); // Exibe uma mensagem indicando que a pontuação foi salva com
                                                     // sucesso.
    }
    
   private static void exibirPontuacoes() {// Função para exibir as pontuações dos jogadores.
    PrintStream out = System.out; // Criação de um objeto PrintStream para a saída padrão.
    out.println("PONTUAÇÕES:"); // Exibe o cabeçalho indicando que as pontuações serão mostradas.
    
    for (int i = 0; i < jogadores.size(); i++) { // Loop que percorre as listas de jogadores e pontuações.
        out.println("O jogador de nome " + jogadores.get(i) + " possui " + pontuacoes.get(i) + " vidas restantes"); // Exibe o nome do jogador e sua pontuação correspondente e Utiliza os índices "i" para acessar as posições nas listas.
        }
    }
}

// "JAVA", "PYTHON", "CPLUSPLUS", "PROGRAMACAO", "DESENVOLVIMENTO"};