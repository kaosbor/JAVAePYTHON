// 1. Calculadora em JAVA

public class Calculadora_Java {
    
    // 1. Calcular a média de três números:
    
    public static void main(String[] args) {
        double numero1 = 10.5;
        double numero2 = 8.2;
        double numero3 = 6.7;

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é: " + media);

// 2. Verificar se um número é par ou ímpar:

        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

// 3. Verificar se um ano é bissexto:

        int ano = 2023;

        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (ehBissexto) {
            System.out.println("O ano É bissexto.");
        } else {
            System.out.println("O ano NÃO É bissexto.");
        }

// 4. Calcular o fatorial de um número:

        int numerof = 5;
        int fatorial = 1;

        for (int i = 1; i <= numerof; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numerof + " é: " + fatorial);

// 5. Verificar se um número é primo:
        int numeroP = 7;
                boolean ehPrimo = true;
        
                for (int i = 2; i < numeroP; i++) {
                    if (numeroP % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
        
                if (ehPrimo) {
                    System.out.println("O número é primo.");
                } else {
                    System.out.println("O número não é primo.");
                }
            }
        }