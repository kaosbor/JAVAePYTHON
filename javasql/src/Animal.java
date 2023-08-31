class Animal {
    String nome;
    int idade;
    String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
        
    public void exibirInfo() {
        System.out.println("-----------------------------");
        System.out.println(" O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);
        System.out.println(" A raça digitada foi: " + raca);
    }

    public String getTipoAnimal() {
        return "Animal";
    }
}