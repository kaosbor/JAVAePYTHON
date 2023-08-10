/* >>> Informações gerais <<<
Título: Exercícios de Java. Autor: RB. Date: 01/08/2023. Instituição: Senai. Curso: Desenvolvimento em Sistemas. Exercícios: 11 a 20.

Exercício 18: Oppenheimer está estudando a variação do preço de uma ação na bolsa de valores. Crie um programa que permita a Oppenheimer registrar o preço da ação em até 10 dias diferentes. Em seguida, exiba a maior variação de preço entre dois dias consecutivos. Dica: Use um vetor para armazenar os preços e faça um loop para calcular a variação entre cada par de dias consecutivos.

Exercício 19: A Barbie está organizando uma competição de natação e precisa registrar os tempos de cada nadador. Crie um programa que permita à Barbie inserir o nome de até 5 nadadores e o tempo que cada um levou para concluir a prova. Ao final, exiba o nome do nadador vencedor. Dica: Use dois vetores, um para armazenar os nomes dos nadadores e outro para os tempos. Utilize um loop para solicitar os dados à Barbie e encontre o tempo mínimo para determinar o vencedor.

Exercício 20: Oppenheimer está estudando os hábitos alimentares de um grupo de pessoas. Crie um programa que permita a Oppenheimer registrar a quantidade de calorias consumidas por cada pessoa durante uma semana (7 dias). Ao final, exiba a pessoa que consumiu a maior quantidade de calorias em um único dia. Dica: Use uma matriz para armazenar as calorias consumidas por cada pessoa em cada dia. Utilize loops "for" aninhados para solicitar os dados a Oppenheimer e encontrar a maior quantidade de calorias em um único dia.
*/

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; // Aleatória

public class Exercicios11a20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        // Exercicios11a20.Exercicio11(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        // Exercicios11a20.Exercicio12(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        // Exercicios11a20.Exercicio13(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        // Exercicios11a20.Exercicio14(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        // Exercicios11a20.Exercicio15(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        // Exercicios11a20.Exercicio16(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */
        Exercicios11a20.Exercicio17(scanner); /* Chama o método (função) ou seja classe.metodo(parametro); */

        scanner.close();
    }

    /* *** Exercício 11:
     * A Lili está organizando uma lista de compras para uma festa que ela vai
     * realizar. Crie um programa que permita à Lili adicionar até 5 itens
     * diferentes à lista de compras. Em seguida, exiba a lista completa para ela
     * conferir. Dica: Use um vetor para armazenar os itens da lista de compras e um
     * loop para solicitar os itens à Lili.
     */

    public static void Exercicio11(Scanner scanner) {
        PrintStream out = System.out;
        out.print("\033[h\033[2J");
        out.print("\n* * * EXERCÍCIO 11 - LISTA DE COMPRAS * * *\n");
        out.print("\n> > > Digite 5 peças de roupas: < < <\n");

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

    /* *** Exercício 12:
     * Oppenheimer está estudando as temperaturas de diferentes cidades. Crie um
     * programa que permita a Oppenheimer registrar as temperaturas médias diárias
     * de uma cidade durante uma semana (7 dias). Ao final, exiba a temperatura
     * média da semana. Dica: Utilize um vetor para armazenar as temperaturas e
     * calcule a média no final usando um loop "for".
     */

    public static void Exercicio12(Scanner scanner) {
        PrintStream out = System.out;

        out.print("\n* * * EXERCÍCIO 12 - TEMPERATURAS * * *\n");
        out.print("\n> > > 1ª Lista de temperaturas/médias em Uberaba/MG: < < <\n");

        float[] temperatura1 = new float[7];
        float[] temperatura2 = new float[7];
        String[] dias = { "segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo" };

        // out.print("\033[h\033[2J");

        for (int i = 0; i < temperatura1.length; i++) {
            out.print("Digite a temperatura de " + dias[i] + ": "); // Aqui insere o dia da semana
            temperatura1[i] = scanner.nextFloat(); // Aqui pede a temperatura para ser digitada
        }

        out.print("\n");

        for (int i = 0; i < temperatura1.length; i++) { // Aqui vai retornar o dia/temperatura juntos.
            out.println("A temperatura de " + temperatura1[i] + " ºC foi registrada no dia de " + dias[i] + ".");
        }

        float somaTemp1 = 0;

        for (int i = 0; i < temperatura1.length; i++) {
            somaTemp1 += temperatura1[i];
        }

        float mediaTemp1 = somaTemp1 / temperatura1.length;

        out.println("\nA média das temperaturas é: " + mediaTemp1 + "ºC.");
        out.printf("\nA média das temperaturas é %.2fºC", mediaTemp1);

        out.print("\n");

        out.print("\n> > > 2ª Lista de temperaturas/médias em Uberaba/MG: < < <\n");

        for (int i = 0; i < temperatura2.length; i++) {
            out.print("A " + (i + 1) + "ª temperatura registrada em graus C é: ");
            temperatura2[i] = scanner.nextFloat();
        }

        out.print("1. As temperaturas registradas são: ");
        for (int i = 0; i < temperatura2.length; i++) {
            out.print(temperatura2[i] + "ºC ");
        }

        out.println("\n\n2. As temperaturas registradas são: ");
        for (int i = 0; i < temperatura2.length; i++) {
            out.println("A data de " + dias[i] + " registrou " + temperatura2[i] + " ºC .");
        }

        float somaTemp2 = 0;

        for (int i = 0; i < temperatura2.length; i++) {
            somaTemp2 += temperatura2[i];
        }

        float mediaTemp2 = somaTemp2 / temperatura2.length;

        out.println("\nA média das temperaturas é: " + mediaTemp2 + "ºC.");
        out.printf("\nA média das temperaturas é %.2f ºC\n", mediaTemp2);

    }

    /* *** Exercício 13 (ANNA):
     * A ANNA está brincando com seus amigos e criou um jogo em que eles devem
     * adivinhar um número secreto entre 1 e 100. Crie um programa que gere um
     * número aleatório entre 1 e 100 e permita que os amigos da Anna tentem
     * adivinhar o número até acertarem. Informe quantas NrPalpites foram
     * necessárias. Dica: Use a classe `java.util.Random` para gerar um número
     * aleatório e um loop para permitir várias NrPalpites.
     */

    public static void Exercicio13(Scanner scanner) {
        PrintStream out = System.out;
        // out.print("\033[h\033[2J");
        Random random = new Random();

        out.println("\n* * * EXERCÍCIO 13 - JOGO * * *\n");
        out.println("> > > Adivinhe o número < < <");

        int numeroSecreto = random.nextInt(101); // Gera um número aleatório entre 1 e 100 ou random.nextInt(101) + 1
        int NrPalpites = 0;
        int palpite;

        do {
            System.out.print("Digite um número de 1 a 100: ");
            palpite = scanner.nextInt();
            NrPalpites++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns, você acertou o número secreto em " + NrPalpites + " tentativas!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }

        } while // do while repete pelo menos 1x - while não precisa 1x para repetir - for : são
                // laços de repetição

        (palpite != numeroSecreto); // Esta é a variável que determina o laço de repetição.

    }

    /* *** Exercício 14:
     * Oppenheimer está trabalhando em um projeto e precisa armazenar as horas
     * gastas em cada tarefa. Crie um programa que permita a Oppenheimer inserir as
     * horas gastas em até 5 tarefas diferentes. Em seguida, exiba o total de horas
     * trabalhadas. Dica: Use um vetor para armazenar as horas de cada tarefa e um
     * loop para solicitar os dados ao Oppenheimer.
     */

    public static void Exercicio14(Scanner scanner) {
        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        out.println("\n* * * EXERCÍCIO 14 - HORAS ARMAZENADAS * * *\n");
        out.println("> > > HORAS TRABALHADAS < < <");

        out.print("Qual a quantidade de tarefas: ");
        int tarefas1 = scanner.nextInt();

        out.print("Qual a quantidade de horas: ");
        int horas1 = scanner.nextInt();

        String[] tarefas = new String[tarefas1];
        int[] horas2 = new int[horas1];

        int somah = 0;
        int somaobjet = 0;

        out.println();
        for (int i = 0; i < tarefas.length; i++) {
            out.print("Digite o " + (i + 1) + "ª tarefa: ");
            tarefas[i] = scanner.next();
            somaobjet++;
        }

        out.println();
        for (int i = 0; i < horas2.length; i++) {
            out.print("Digite a quantidade de horas da " + (i + 1) + "ª tarefa trabalhada : ");
            horas2[i] = scanner.nextInt();
            somah = somah + horas2[i];
        }

        out.print("\nForam trabalhadas " + somah + " horas em um total de " + somaobjet + " tarefas.");

        float MediaTotal = somah / somaobjet; // Correção da média

        out.println("\n\nA média de horas trabalhadas por tarefa é: " + MediaTotal);
    }

    /* *** Exercício 15:
     * Sarah está organizando um sorteio de brindes para sua festa e precisa
     * sortear aleatoriamente 3 números dentre os convidados. Crie um programa que
     * permita à Sarah registrar os nomes dos convidados e, ao final, exiba os
     * nomes dos 3 sorteados. Dica: Use um vetor para armazenar os nomes dos
     * convidados e a classe `java.util.Random` para fazer o sorteio.
     */

    public static void Exercicio15(Scanner scanner) {
        PrintStream out = System.out;
        System.out.println("\n* * * EXERCÍCIO 15 - SORTEIO DE BRINDES * * *\n");
        System.out.println("> > > SORTEIO DE 3 CONVIDADOS < < <");

        out.print("Quantos convidados participarão do sorteio? ");
        int NrConvidados = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

        List<String> NomeConvidados = new ArrayList<>();

        for (int i = 0; i < NrConvidados; i++) {
            System.out.print("Digite o nome do convidado " + (i + 1) + ": ");
            NomeConvidados.add(scanner.nextLine());
        }

        // Embaralhar a lista de convidados usando o algoritmo de Fisher-Yates
        Random random = new Random();
        for (int i = NomeConvidados.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = NomeConvidados.get(i);
            NomeConvidados.set(i, NomeConvidados.get(j));
            NomeConvidados.set(j, temp);
        }

        List<String> sorteados = NomeConvidados.subList(0, Math.min(3, NomeConvidados.size()));

        System.out.println("\nOs 3 sorteados são:");
        for (int i = 0; i < sorteados.size(); i++) {
            System.out.println((i + 1) + ". " + sorteados.get(i));
        }
    }

    /* *** Exercício 16:
    Gilberto está estudando as vendas de um produto em uma loja. Crie um programa que permita a Gilberto registrar as vendas diárias desse produto durante uma semana (7 dias). Ao final, exiba a média de vendas diárias da semana. Dica: Utilize um vetor para armazenar as vendas diárias e calcule a média no final usando um loop "for".
     */

    public static void Exercicio16(Scanner scanner) {
        PrintStream out = System.out;
        out.print("\033[h\033[2J");
        out.println("\n* * * EXERCÍCIO 16 - PRODUTOS LOJA * * *\n");
        out.println("> > > REGISTRO DE VENDAS DIÁRIAS < < <");

    double[] vendasDiarias = new double[7];
    String[] diaSemana = { "segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo" };

   for (int i = 0; i < vendasDiarias.length; i++) {
    out.print("Digite o " + (i+1) + "º valor de vendas para " + diaSemana[i] + ": ");
    vendasDiarias[i] = scanner.nextDouble();
    }

    double totalVendas = 0;

    for (double venda : vendasDiarias) { // :  
        totalVendas += venda;
    }

        double mediaVendas = (totalVendas / vendasDiarias.length);

        out.println("\nForam registradas um total de " + vendasDiarias.length + " vendas, sendo uma para cada dia da semana.");
        out.printf("A média de vendas diárias da semana é de R$ %.2f." , mediaVendas);

    }

    /* *** Exercício 17:
    Sarah está organizando um torneio de quebra-cabeças para seus amigos. Cada amigo resolveu um certo número de quebra-cabeças e ela precisa saber quantos quebra-cabeças cada amigo resolveu. Crie um programa que permita à Sarah inserir o nome de até 5 amigos e a quantidade de quebra-cabeças resolvidos por cada um. Ao final, exiba o nome e a quantidade de quebra-cabeças de cada amigo. Dica: Use dois vetores, um para armazenar os nomes dos amigos e outro para as quantidades de quebra-cabeças resolvidos por cada um. Use um loop para solicitar os dados à Sarah.*/

    public static void Exercicio17(Scanner scanner) {

        PrintStream out = System.out;
        out.print("\033[h\033[2J");

        out.println("\n* * * EXERCÍCIO 17 - QUEBRA-CABEÇAS * * *\n");
        out.println("> > > RESOLUÇÃO DE QUEBRA-CABEÇA < < <");

<<<<<<< HEAD
        // ***********************

        out.print("Quantos amigos jogarão quebra-cabeça? ");

        out.print("Quantos amigos jogarão participarão do sorteio (5)? ");
        int NrAmigos = scanner.nextInt();
        scanner.nextLine(); // Faz quebra de linha a cada valor após o nextInt()

        /* 
        out.print("Quantos quebra-cabeças cada amigo resolveu? ");
        int NrAmigos = scanner.nextInt();
        scanner.nextLine(); // Faz quebra de linha a cada valor após o nextInt()
        */
        
        List<String> NomeAmigos = new ArrayList<>();
        List<Integer> NomeJogos = new ArrayList<>();

        // ***********************

        // ***********************
        out.println("\nNOME DOS AMIGOS A DIGITAR:"); 

        // Inserção / Entrada
        for (int i = 0; i < NrAmigos; i++) {
            out.print("Digite o nome do " + (i + 1) + "º amigo de Sarah: ");
            NomeAmigos.add(scanner.nextLine());
        }

        // ***********************
        out.println("\nNOMES DO AMIGOS INSERIDOS:"); 
            out.print("Digite o nome do amigo " + (i + 1) + ": ");
            NomeAmigos.add(scanner.nextLine());
        }

        for (int i = 0; i < NrAmigos; i++) {
            out.println("O nome do " + (i + 1) + "º é " + NomeAmigos.get(i) + ".");
        }
        


/*
>>>>>>> 91e0073a2539d7ac727cbc4b02d7bd919de144b4

        // Retorno / Saída
        for (int i = 0; i < NrAmigos; i++) {
            out.println("O nome do " + (i + 1) + "º amigo é de Sarah é: " + NomeAmigos.get(i));            
        }
       
        // ***********************
        out.println("\nQUANTOS QUEBRA-CABEÇAS:"); 

        for (int i = 0; i < NrAmigos; i++) {
        out.print("Quantos jogos de quebra-cabeça o " + (i+1) + "º amigo de Sarah com nome de " + NomeAmigos.get(i) + " resolveu? ");
        NomeJogos.add(scanner.nextInt());
        }

        // ***********************
        out.println("\nAMIGOS E QUEBRA-CABEÇAS:"); 

        // Retorno / Saída
        for (int i = 0; i < NrAmigos; i++) {
            out.println("O " + (i + 1) + "º amigo de Sarah de nome " + NomeAmigos.get(i) + " resolveu " + NomeJogos.get(i) + " quebra-cabeças.");            
        }

        // ***********************

        // do while - laço de repetição mais amplo (usa variável de forma mais ampla)
        // for - laço de repetição mais específico (conforma a variável determinada)
    }
}