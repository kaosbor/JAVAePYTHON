package xclasses;

public class Person {
   
    // Atributos
    private String name;
    private int age;
    
    // Cosntrutor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método
    public void introduce(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old");
        // System.out.println("Olá, meu nome é " + name + " e tenho " + age + " anos de idade");
    }
}

    // Uso da classe person
    
    public class Main {
        public static void main(String[] args) {
            // Criando objetos da classe Person
            Person person1 = new Person("Bruno", 30);
            Person person2 = new Person("Anna", 25);
            
            // Chamando o método introduce() dos objetos
            person1.introduce();
            person2.introduce();
        }
    }