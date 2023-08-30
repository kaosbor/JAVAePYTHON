public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Animal girrafa = new Animal(); // Classe Objeto = new(novo objeto) Animal(objeto do tipo animal)    
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.print("\033[h\033[2J");
        // Chamada dos objetos 
        girrafa.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}