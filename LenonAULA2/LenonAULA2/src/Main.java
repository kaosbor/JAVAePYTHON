import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de animal:");
        System.out.println("1. Cadastrar produtor");
        System.out.println("2. Pesquisa produto");
        System.out.println("3. Sair");
        System.out.print("Digite sua escolha: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        switch (escolha) {
            case 1:
                System.out.print("Escolha o PRODUTO: ");
                String nomeCachorro = scanner.nextLine();

                /*
                System.out.print("Digite o SISTEMA OPERACIONAL: ");
                int idadeCachorro = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer

                System.out.print("Digite o modelo do COMPUTADOR: ");
                String racaCachorro = scanner.nextLine();

                Animal novoCachorro = new Cachorro(nomeCachorro, idadeCachorro, racaCachorro);
                novoCachorro.exibirInfo();
                BancoDeDados.inserirAnimal(novoCachorro);
                break;
                */

            case 2:
                System.out.println("\nListe o produtor desejado: ");
                System.out.println("1. Processadores");
                System.out.println("2. Sistema Operacional;");
                System.out.println("3. Computador");
                String nomeGato = scanner.nextLine();

                /* 
                System.out.print("Digite a idade do gato: ");
                int idadeGato = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer

                System.out.print("Digite a raça do gato: ");
                String racaGato = scanner.nextLine();

                Animal novoGato = new Gato(nomeGato, idadeGato, racaGato);
                novoGato.exibirInfo();
                BancoDeDados.inserirAnimal(novoGato);
                break;
                */

            case 3:
                // Classe   // Objeto      new Método 
                ConsultaSQL novaConsulta = new ConsultaSQL();
                // Objeto sempre chama o método
                novaConsulta.ConsultaSQL();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
