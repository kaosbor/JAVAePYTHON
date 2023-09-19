/* >>> Informações gerais <<<
Título: Exercícios de Java - Preparação para o trabalho 2 (11/08/2023). Autor: RB. Date: 18/08/2023. Instituição: Senai. Curso: Desenvolvimento em Sistemas. Exercícios: 01 a 12. */

package java52;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; // Aleatória

public class Exercicios01a12 {

    /* Início do PRIMEIRO MÉTODO */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;
        out.print("\033[h\033[2J");
        Exercicios01a12.ExercicioPalavras(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        scanner.close();
    } /* Fim do PRIMEIRO método. */

    /* Início do SEGUNDO método. */
    public static void ExercicioPalavras(Scanner scanner) {
        
        PrintStream out = System.out;
        out.print("\033[h\033[2J");
        
        out.print("\n* * * EXERCÍCIO - PALAVRAS - CRIANÇAS * * *\n");
        
        String[] palavrasSecreta = {"JAVA", "PYTHON", "CPLUSPLUS", "JAVASCRIPT", "RUBY", "PHP"}; // Vetor de String recebe PalavrasSecretas com qualquer valor a frente que está entre as {}. 
        String palavraSecreta = escolherPalavraAleatoria(palavrasSecreta);

        int vidas = 6; // De 0 a 5 = 6
        char[] NovaLetra = new char[palavraSecreta.length()];
        for (int i = 0; i < NovaLetra.length; i++) {
            NovaLetra[i] = '_';
        }

        while (vidas > 0) {
            out.print("\nPalavra atual: " + new String(NovaLetra) + "\n");
            out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean RecebeLetra = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    NovaLetra[i] = letra;
                    RecebeLetra = true;
                }
            }

            if (!RecebeLetra) {
                vidas--; // Op. que diminui o valor da variável vidas em 1 unidade (decremento).
                out.print("\nA letras '" + letra + "' NÃO existe na palavra!"); 
                out.print("\nVidas restantes: " + vidas);
            }

            if (palavraCompleta(NovaLetra)) {
                out.println("\nParabéns, você acertou a palavra: " + palavraSecreta);
                break;
            }

            if (vidas == 0) {
                out.println("Você perdeu! A palavra era: " + palavraSecreta);
            }
        }
    }   /* Fim do SEGUNDO método. */

        /* Início de função: escolherPalavraAleatoria */
            public static String escolherPalavraAleatoria(String[] palavras) {
            Random random = new Random();
            int indice = random.nextInt(palavras.length);
            return palavras[indice];
            }

            public static boolean palavraCompleta(char[] NovaLetra) {
            /* para */ for (char letra : NovaLetra) {
                /* se */ if (letra == '_') {
                    return false;
                } 
            }
            return true;
            } 

} /* Fim do código. */

/* Exercício:
1. Defina uma lista de palavras secretas que serão utilizadas no jogo. Por exemplo: "JAVA", "PYTHON", "CPLUSPLUS", "JAVASCRIPT", "RUBY", "PHP".
2. Escolha aleatoriamente uma palavra da lista de palavras secretas e armazene em uma variável chamada "palavraSecreta".

3. Inicialize uma variável "vidas" com o número máximo de tentativas permitidas (por exemplo, 6). Essa variável será usada para controlar o número de erros que o jogador pode cometer.

4. Crie um array de caracteres chamado "NovaLetra" com o mesmo tamanho da "palavraSecreta". Inicialize todas as posições do array com um caractere específico (por exemplo, '_').

5. Crie um loop principal que irá executar até que o jogador acerte a palavra ou esgote todas as vidas.

6. Exiba o estado atual da palavra para o jogador, mostrando apenas as letras já descobertas e substituindo as não descobertas pelo caractere específico.

7. Solicite ao jogador que digite uma letra.

8. Verifique se a letra digitada pelo jogador está presente na "palavraSecreta". Se estiver, atualize o array "NovaLetra" com as posições onde a letra aparece na palavra secreta.

9. Caso a letra não esteja na palavra, diminua uma vida do jogador e exiba uma mensagem indicando o erro.

10. Verifique se o jogador acertou todas as letras da palavra secreta. Se sim, exiba uma mensagem de parabéns e encerre o jogo. Caso contrário, volte ao passo 6.

11. Se o jogador esgotar todas as vidas, exiba uma mensagem informando que ele perdeu o jogo e mostre qual era a "palavraSecreta".

12. Após o término do jogo, pergunte ao jogador se ele deseja jogar novamente. Se a resposta for afirmativa, retorne ao passo 2. Caso contrário, encerre o programa.

Dicas adicionais:
- Utilize a classe `Random` para escolher aleatoriamente uma palavra da lista de palavras secretas.
- Utilize a classe `Scanner` para ler a entrada do jogador.
- Utilize um loop `for` para percorrer as letras da "palavraSecreta" e atualizar o array "NovaLetra" com as letras corretas.

*/