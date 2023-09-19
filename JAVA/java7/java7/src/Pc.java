public class Pc {
    public static void main(String[] args) {
        // Criando objetos diferentes. Ex.: criou o objeto para a classe Pai "Pc" chamar a classe filha "Hardware".

        Hardware lenovo = new Hardware("Monitor 24 pol", "Mouse optico", "Teclado tátil");
        lenovo.AcaoChutar(); // Chamar a função  
        
        Hardware dell = new Hardware("Monitor 21 pol", "Mouse sem fio", "Teclado sem fio");
        dell.AcaoChutar();

        Software digital = new Software("Linux Mint", "RedFriends", "Google Chrome");
        digital.AcaoXingar(); // Chamar a função

        Software teclar = new Software("Windows", "Whatsapp", "Edge");
        teclar.AcaoXingar();

    }
}

class Hardware extends Pc {
    // Criando atributos
    private String Monitor;
    private String Mouse;
    private String Teclado;

    // Método especial - Construtor
    public Hardware(String Periferico1, String Periferico2, String Periferico3) {
        this.Monitor = Periferico1;
        this.Mouse = Periferico2;
        this.Teclado = Periferico3;
    }

    // Método principal
    public static void main(String[] fisica) {
    }

    // Métodos específicos
    public void AcaoChutar(){
        System.out.println("Você está prestes a quebrar o " + Monitor + ", o " + Mouse + " e o " + Teclado);
    }


}


class Software extends Pc {
    // Criando atributos
    private String SisOperacional;
    private String Programa;
    private String Navegador;

    // Método especial - Construtor
    public Software(String os, String amigos, String navegador) {
        this.SisOperacional = os;
        this.Programa = amigos;
        this.Navegador = navegador;
    }

    public static void main(String[] logica) {
    }

    // Métodos específicos
    public void AcaoXingar(){
        System.out.println("Você está prestes a xingar o " + SisOperacional + ", o " + Programa + " e o " + Navegador);
    }

}