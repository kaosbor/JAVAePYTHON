// Importando a classe Scanner do pacote java.util
import java.util.Scanner;

// Definindo a classe principal chamada Main
public class Main {
    // Definindo o método principal
    public static void main(String[] args) {
        // Criando uma instância da classe Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        // Exibindo mensagens para o usuário
        System.out.println("------ Menu de escolha ------");
        System.out.println("Escolha o tipo de animal:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        System.out.println("3. Mostrar banco de dados");
        System.out.println("-----------------------------");
        
        // Solicitando ao usuário que insira sua escolha e armazenando-a na variável "escolha"
        System.out.print("Digite aqui sua escolha: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        System.out.println("-----------------------------");

        // Solicitando ao usuário que insira o nome do animal e armazenando-o na variável "nome"
        System.out.print("Digite o nome do animal: "); // Pergunta o nome
        String nome = scanner.nextLine(); // Recebe o nome

        // Solicitando ao usuário que insira a idade do animal e armazenando-a na variável "idade"
        System.out.print("Digite a idade do animal: "); // Pergunta a idade
        int idade = scanner.nextInt(); // Recebe a idade
        scanner.nextLine();  // Limpar o buffer

        // Solicitando ao usuário que insira a raça do animal e armazenando-a na variável "raca"
        System.out.print("Digite a raça: "); // Pergunta a raça
        String raca = scanner.nextLine(); // Recebe a raça
        
        Animal novoAnimal; // Declarando um objeto "novoAnimal" do tipo "Animal"
        BancoDeDados tabelas;
        // Verificando a escolha do usuário e criando uma instância do tipo apropriado (Cachorro ou Gato)
        if (escolha == 1) {
            novoAnimal = new Cachorro(nome, idade, raca);
        } else if (escolha == 2) {
            novoAnimal = new Gato(nome, idade, raca);
        } else if (escolha == 3) {
            System.out.println("Liste os dados.");
            tabelas = new BancoDeDados(tabelas);
            return; 
        } else {
            System.out.println("Opção inválida.");
            return;  // Encerrando o método principal prematuramente
        }

        // Chamando o método "exibirInfo" do objeto "novoAnimal" para mostrar informações sobre o animal
        novoAnimal.exibirInfo();

        // Inserindo o novo animal no banco de dados utilizando o método estático "inserirAnimal" da classe "BancoDeDados"
        BancoDeDados.inserirAnimal(novoAnimal);
        BancoDeDados.showTables(tabelas);
    }
}
