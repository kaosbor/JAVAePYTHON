public class SistemaOperacional extends Produto {
    public SistemaOperacional(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String getTipoAnimal() {
        return "Gato";
    }
}
