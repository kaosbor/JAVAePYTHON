package JAVA;

public class Retangulo {
    private int width;
    private int heigth;

    public Retangulo (int width, int heigth){
        this.width = width;
        this.heigth = heigth;
    }

    public int CalcularArea(){
        return width * heigth;
    }

        public static void main(String[] args) {
            Retangulo retangulo = new Retangulo(5,3);
            int area = retangulo.CalcularArea();
            System.out.println("A área do retângulo é " + area + "m².");
        }   


        


}