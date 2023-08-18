package trabalho;

/* TRabalho 1: Você foi contratado como desenvolvedor(a) para criar um Jogo da Forca em Java para auxiliar estudantes no aprendizado de palavras e vocabulário. O jogo deverá ser implementado em modo texto (console) e seguir as seguintes especificações:

1. O programa deve apresentar um menu inicial com as seguintes opções:
   - Iniciar novo jogo
   - Verificar pontuações
   - Sair do jogo

*/


import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class trabalho1 {

    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "CPLUSPLUS", "PROGRAMACAO", "DESENVOLVIMENTO"};
    private static final int MAX_TENTATIVAS = 6; // Número máximo de tentativas
    
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static List<String> jogadores = new ArrayList<>();
    private static List<Integer> pontuacoes = new ArrayList<>();
    
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("MENU:");
            System.out.println("1. Iniciar novo jogo");
            System.out.println("2. Verificar pontuações");
            System.out.println("3. Sair do jogo");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    novoJogo();
                    break;
                case 2:
                    exibirPontuacoes();
                    break;
                case 3:
                    System.out.println("Obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 3);
    }
    
    private static void novoJogo() {
        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)];
        int vidas = MAX_TENTATIVAS;
        StringBuilder palavraAtual = new StringBuilder("_".repeat(palavra.length()));
        
        while (vidas > 0 && palavraAtual.toString().contains("_")) {
            System.out.println("Palavra: " + palavraAtual);
            System.out.println("Vidas restantes: " + vidas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);
            
            if (!Character.isLetter(letra)) {
                System.out.println("Entrada inválida. Digite apenas letras.");
                continue;
            }
            
            if (palavra.indexOf(letra) == -1) {
                vidas--;
            } else {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        palavraAtual.setCharAt(i, letra);
                    }
                }
            }
        }
        
        if (vidas == 0) {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        } else {
            System.out.println("Parabéns, você acertou a palavra: " + palavra);
            System.out.print("Digite seu nome para salvar sua pontuação: ");
            String nomeJogador = scanner.next();
            salvarPontuacao(nomeJogador, vidas);
        }
    }
    
    private static void salvarPontuacao(String jogador, int vidas) {
        jogadores.add(jogador);
        pontuacoes.add(vidas);
        System.out.println("Pontuação salva com sucesso!");
    }
    
    private static void exibirPontuacoes() {
        System.out.println("PONTUAÇÕES:");
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(jogadores.get(i) + ": " + pontuacoes.get(i) + " vidas restantes");
        }
    }
}


