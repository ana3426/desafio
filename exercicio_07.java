package desafio;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro positivo: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número inteiro positivo: ");
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("\nErro: Ambos os números devem ser positivos!");
            sc.close();
            return;
        }
        // Guarda os valores originais para exibir no final
        int num1 = a;
        int num2 = b;
        System.out.println("\nCalculando o MDC de " + num1 + " e " + num2 + "...");
        // Algoritmo de Euclides usando o operador módulo (%)
        while (b != 0) {
            int resto = a % b; // calcula o resto da divisão
            System.out.printf("a = %d, b = %d → resto = %d\n", a, b, resto);
            a = b;             // o divisor vira o novo dividendo
            b = resto;         // o resto vira o novo divisor
        }
        // Quando b == 0, o valor de a é o MDC
        System.out.println(" O Máximo Divisor Comum (MDC) de " + num1 + " e " + num2 + " é: " + a);
    }
}
