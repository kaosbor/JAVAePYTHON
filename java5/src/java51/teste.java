/* *** Exercício 16:
   Gilberto está estudando as vendas de um produto em uma loja. Crie um programa que permita a Gilberto registrar as vendas diárias desse produto durante uma semana (7 dias). Ao final, exiba a média de vendas diárias da semana. Dica: Utilize um vetor para armazenar as vendas diárias e calcule a média no final usando um loop "for".
*/

public static void Exercicio16(Scanner scanner) {
    PrintStream out = System.out;
    System.out.println("\n* * * EXERCÍCIO 16 - PRODUTOS LOJA * * *\n");
    System.out.println("> > > REGISTRO DE VENDAS DIÁRIAS < < <");

    double[] vendasDiarias = new double[7];
    String[] diaSemana = { "segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo" };

    out.print("\033[h\033[2J");

    for (int i = 0; i < vendasDiarias.length; i++) {
        out.print("Digite o valor de vendas para " + diaSemana[i] + ": ");
        vendasDiarias[i] = scanner.nextDouble();
    }

    double totalVendas = 0;
    for (double venda : vendasDiarias) {
        totalVendas += venda;
    }

    double mediaVendas = totalVendas / vendasDiarias.length;

    out.println("\nAs vendas diárias foram registradas. A média de vendas diárias da semana é: " + mediaVendas);
}
