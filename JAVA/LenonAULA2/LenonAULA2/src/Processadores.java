public class Processadores extends Produto {
    public Processadores(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    // ACERTAR
    @Override
    public String getTipoAnimal() {
        return "Cachorro";
    }
}
