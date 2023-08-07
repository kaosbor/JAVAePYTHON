package java1;
public class Media { // Classe
    public static void main(String[] args) { // Método (main)
        System.out.println("Calcular a média:");
        float valor1 = 3f;
        float valor2 = 4f;
        float valor3 = -4.5f;
        Numero.Media(valor1, valor2, valor3); // (A chamada da classe) A relação é a partir daqui, onde chama a classe NUMERO e o Método MEDIA - Numero.Media
    }
}

class Numero { // Classe
    public static void Media(float a, float b, float c) { // Método
        float num1 = (a); // Passa o parâmetro
        float num2 = (b);
        float num3 = (c);
        float media = (num1 + num2 + num3) / 3;
 
        String mediaFormatada = String.format("%.2f", media);

        System.out.println("A média da soma dos números " + num1 + " + " + num2 + " + " + num3 + " é " + mediaFormatada + ".");


        // System.out.println("A média da soma dos números " + num1 + " + " + num2 + " + " + num3 + " é " + media + "."); // + e String ""
    }
}