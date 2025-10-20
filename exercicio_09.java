package desafio;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = scanner.nextInt();
        System.out.println("Decomposição em fatores primos de " + numero + ":");
        int divisor = 2;
        while (numero > 1) {
            int contagem = 0;
            while (numero % divisor == 0) {
                numero /= divisor;
                contagem++;
            }
            if (contagem > 0) {
                System.out.println("Fator " + divisor + " (potência " + contagem + ")");
            }
            // Otimização: Se o divisor for 2, o próximo a testar é 3.
            // Se for ímpar, o próximo a testar é ímpar (+2).
            if (divisor == 2) {
                divisor = 3;
            } else {
                divisor += 2;
            }
        }
    }
}