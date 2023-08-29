public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Oi, me chamo " + name + " e eu tenho " + age + " anos.");
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}