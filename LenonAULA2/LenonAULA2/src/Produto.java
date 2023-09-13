public class Produto {
    String nome;
    int idade;
    String raca;

    public Produto(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Raça: " + raca);
    }

    public String getTipoAnimal() {
        return "Animal";
    }
}
