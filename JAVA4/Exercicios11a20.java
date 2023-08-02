/* 
Exercício 12: Oppenheimer está estudando as temperaturas de diferentes cidades. Crie um programa que permita a Oppenheimer registrar as temperaturas médias diárias de uma cidade durante uma semana (7 dias). Ao final, exiba a temperatura média da semana. Dica: Utilize um vetor para armazenar as temperaturas e calcule a média no final usando um loop "for".

Exercício 13: A Barbie está brincando com seus amigos e criou um jogo em que eles devem adivinhar um número secreto entre 1 e 100. Crie um programa que gere um número aleatório entre 1 e 100 e permita que os amigos da Barbie tentem adivinhar o número até acertarem. Informe quantas tentativas foram necessárias. Dica: Use a classe `java.util.Random` para gerar um número aleatório e um loop para permitir várias tentativas.

Exercício 14: Oppenheimer está trabalhando em um projeto e precisa armazenar as horas gastas em cada tarefa. Crie um programa que permita a Oppenheimer inserir as horas gastas em até 5 tarefas diferentes. Em seguida, exiba o total de horas trabalhadas. Dica: Use um vetor para armazenar as horas de cada tarefa e um loop para solicitar os dados ao Oppenheimer.

Exercício 15: A Barbie está organizando um sorteio de brindes para sua festa e precisa sortear aleatoriamente 3 números dentre os convidados. Crie um programa que permita à Barbie registrar os nomes dos convidados e, ao final, exiba os nomes dos 3 sorteados. Dica: Use um vetor para armazenar os nomes dos convidados e a classe `java.util.Random` para fazer o sorteio.

Exercício 16: Oppenheimer está estudando as vendas de um produto em uma loja. Crie um programa que permita a Oppenheimer registrar as vendas diárias desse produto durante uma semana (7 dias). Ao final, exiba a média de vendas diárias da semana. Dica: Utilize um vetor para armazenar as vendas diárias e calcule a média no final usando um loop "for".

Exercício 17: A Barbie está organizando um torneio de quebra-cabeças para seus amigos. Cada amigo resolveu um certo número de quebra-cabeças e ela precisa saber quantos quebra-cabeças cada amigo resolveu. Crie um programa que permita à Barbie inserir o nome de até 5 amigos e a quantidade de quebra-cabeças resolvidos por cada um. Ao final, exiba o nome e a quantidade de quebra-cabeças de cada amigo. Dica: Use dois vetores, um para armazenar os nomes dos amigos e outro para as quantidades de quebra-cabeças resolvidos por cada um. Use um loop para solicitar os dados à Barbie.

Exercício 18: Oppenheimer está estudando a variação do preço de uma ação na bolsa de valores. Crie um programa que permita a Oppenheimer registrar o preço da ação em até 10 dias diferentes. Em seguida, exiba a maior variação de preço entre dois dias consecutivos. Dica: Use um vetor para armazenar os preços e faça um loop para calcular a variação entre cada par de dias consecutivos.

Exercício 19: A Barbie está organizando uma competição de natação e precisa registrar os tempos de cada nadador. Crie um programa que permita à Barbie inserir o nome de até 5 nadadores e o tempo que cada um levou para concluir a prova. Ao final, exiba o nome do nadador vencedor. Dica: Use dois vetores, um para armazenar os nomes dos nadadores e outro para os tempos. Utilize um loop para solicitar os dados à Barbie e encontre o tempo mínimo para determinar o vencedor.

Exercício 20: Oppenheimer está estudando os hábitos alimentares de um grupo de pessoas. Crie um programa que permita a Oppenheimer registrar a quantidade de calorias consumidas por cada pessoa durante uma semana (7 dias). Ao final, exiba a pessoa que consumiu a maior quantidade de calorias em um único dia. Dica: Use uma matriz para armazenar as calorias consumidas por cada pessoa em cada dia. Utilize loops "for" aninhados para solicitar os dados a Oppenheimer e encontrar a maior quantidade de calorias em um único dia.
*/

package JAVA4;

// import java.nio.charset.Charset;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicios11a20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        Exercicios11a20.Exercicio11(scanner);  // Funções

        scanner.close();
    }   

/* Exercício 11:
A Barbie está organizando uma lista de compras para uma festa que ela vai realizar. Crie um programa que permita à Barbie adicionar até 5 itens diferentes à lista de compras. Em seguida, exiba a lista completa para ela conferir. Dica: Use um vetor para armazenar os itens da lista de compras e um loop para solicitar os itens à Barbie.*/

public static void Exercicio11(Scanner scanner) {

    // System.out.println(Charset.defaultCharset());
    
    PrintStream out = System.out;

    out.print("*** Lista de compras da BARBIE ***\n");

    String[] objetos = new String[5];

        for (int i = 0; i < objetos.length; i++) {
            out.print("Digite a " + (i + 1) + "ª peça da lista de compras: ");
            objetos[i] = scanner.next();
        }

        out.println("\nAs peças na lista são:");
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("A " + (i + 1) + "ª peça é: " + objetos[i]);
        }

        out.println("\nAs peças na lista são:");
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("As peças são: " + objetos[i]);
        }

    }

}

/*
 
out.println("\nAs peças na lista são:");
        for (int i = 0; i < objetos.length; i++) {
            System.out.print(objetos[i]);
            if (i < objetos.length - 1) {
                System.out.print(" "); // Adicionar espaço entre os itens, exceto no último
            }
        }
        System.out.println(); // Pular linha após a lista de itens
    }


 */