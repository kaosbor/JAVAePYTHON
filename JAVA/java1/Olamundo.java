package java1;

//Em resumo, esse código define uma classe chamada "olamundo" que contém um método main. Dentro desse método, usamos o método println para imprimir a mensagem "ola mundo" no console.
public class Olamundo { // Aqui estamos definindo uma classe chamada "olamundo". O nome da classe deve começar com uma letra maiúscula e corresponder ao nome do arquivo que contém o código.
    public static void main(String[] args) { //Essa é a assinatura do método principal do programa. Todo programa Java precisa ter um método main como ponto de entrada. Ele é público (public), estático (static) e não retorna nenhum valor (void). Também recebe um argumento do tipo String[] chamado args, que é usado para passar argumentos para o programa a partir da linha de comando.
        System.out.println("Olá mundo, amigo!"); // Aqui estamos usando a classe System para acessar o método println, que significa "imprimir uma nova linha". Estamos passando a string "ola mundo" como argumento para o método println, que será exibida no console.
        System.out.println("Segunda impressão.");
    }
}