package trabalho;

/* Trabalho 1:
Você foi contratado como desenvolvedor(a) para criar um Jogo da Forca em Java para auxiliar estudantes no aprendizado de palavras e vocabulário. O jogo deverá ser implementado em modo texto (console) e seguir as seguintes especificações:*/

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class trabalho1 {

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
            out.print("Escolha uma opção (1 a 3): ");
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
                    out.println("Obrigado por jogar!"); // Caso 3, o jogo terminará e será exibida a mensagem "Obrigado por jogar!".
                    break;      // Após a execução do código dentro de um case vem a instrução break para sair do bloco switch, evitando erros e loops.
                default: out.println("Opção inválida. Escolha novamente.\n"); // Caso opcional, executado se nenhum dos valores dos case acima, corresponder ao valor de EscolhaOpcao. É uma espécie de "else" para lidar com situações não previstas.
            }
        } while (EscolhaOpcao != 3); // é um exemplo de um loop while em uma linguagem de programação. Vou explicar como ele funciona:
    
        /*
         Aqui estão os principais pontos dessa construção:

while: while é uma estrutura de controle de fluxo que permite repetir um bloco de código enquanto uma condição especificada for verdadeira.

EscolhaOpcao != 3: Esta é a condição que é verificada a cada iteração do loop. Ela verifica se o valor de EscolhaOpcao é diferente de 3.

Código a ser executado: O bloco de código dentro das chaves {} será repetidamente executado enquanto a condição EscolhaOpcao != 3 for verdadeira.

Portanto, o loop while continuará a executar o bloco de código repetidamente enquanto a variável EscolhaOpcao não for igual a 3. Assim que EscolhaOpcao atingir o valor 3, a condição se tornará falsa e o loop será interrompido, movendo o fluxo de execução para o código após o loop.

Lembre-se de que é importante garantir que a condição dentro do while seja eventualmente falsa para evitar loops infinitos. Certifique-se de que dentro do loop ocorram mudanças que possam levar a condição a se tornar falsa, caso contrário o loop nunca será interrompido.
         */
    
    }
    
    private static void novoJogo() {
        PrintStream out = System.out;
        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)];
        int vidas = MAX_TENTATIVAS;
        out.println("O Jogo começou, você terá direito a " + MAX_TENTATIVAS + " tentativas."); // Aqui demonstra de forma direta a quantidade de tentativa.
        StringBuilder palavraAtual = new StringBuilder("_".repeat(palavra.length())); // Criada a variável "palavraAtual" usada para armazenar o objeto StringBuilder (classe que permite a criação e manipulação de strings mutáveis, maneira mais eficiente de construir strings modificáveis) criando uma string com apenas um caractere sublinhado, que será usada como ponto de partida para a construção da nova string. NO caos de repeat(palavra.length()): O método repeat é chamado na string _, sendo usado para criar uma nova string repetindo o conteúdo da string original x vezes. Nesse caso, a string _ será repetida até o tamanho da palavra.length() quantas vezes for necessária, ou seja, a linha de código cria uma nova string usando o caractere sublinhado _ repetido um número de vezes igual ao comprimento da string palavra. A nova string é então usada para inicializar um objeto StringBuilder chamado palavraAtual, que pode ser posteriormente manipulado para construir a representação desejada da palavra com sublinhados. 
        
        while (vidas > 0 && palavraAtual.toString().contains("_")) {
            out.println("Palavra: " + palavraAtual);
            out.println("Vidas restantes: " + vidas);
            System.out.print("Digite uma letra: ");
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
                        palavraAtual.setCharAt(i, letra);
                    }
                }
            }
        }
        
        if (vidas == 0) {
            out.println("Você perdeu! A palavra era: " + palavra);
        } else {
            out.println("Parabéns, você acertou a palavra: " + palavra);
            System.out.print("Digite seu nome para salvar sua pontuação: ");
            String nomeJogador = scanner.next();
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
            out.println(jogadores.get(i) + ": " + pontuacoes.get(i) + " vidas restantes");
        }
    }
}

