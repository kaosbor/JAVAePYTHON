public class Computador extends Produto {
    public Computador(String nome, String modelo, String tipo) {
        super(nome, modelo, tipo);
    }

    // ACERTAR
    @Override
    public String getTipoAnimal() {
        return "Cachorro";
    }
}
