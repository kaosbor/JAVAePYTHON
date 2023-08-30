public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3, 4, 5}; // Posição
            System.out.println(numbers[5]); // Posição 5 = Número 6
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Ocorreu uma exceção: " + erro.getMessage());
            // Ocorreu uma exceção: Index 5 out of bounds for length 3
            // Ocorreu uma exceção: Índice 5 fora dos limites de comprimento
        }
    }

} 