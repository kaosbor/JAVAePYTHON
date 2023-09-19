package java52;

import java.util.*;

public class RegistroTelefonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> registro = new HashMap<>();

        while (true) { // Enquanto verdadeiro
            System.out.print("Digite o nome do usuário (ou sair): ");
            String nome = scanner.nextLine();
            if (nome.equals("sair")) {
                break;
            }

            System.out.print("Digite o número de telefone: ");
            String telefone = scanner.nextLine();
            registro.put(nome, telefone);
        }

        System.out.println("Registro de Nomes e Telefones:");
        for (String nome : registro.keySet()) { // Para
            String telefone = registro.get(nome);
            System.out.println(nome + " possui o nr " + telefone + " em seu cadastro.");
        }

    scanner.close();

    }
}