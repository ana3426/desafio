package desafio;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = sc.nextInt();
        long a = 0, b = 1; // Inicia os dois primeiros termos
        System.out.println("Sequência de Fibonacci com primos:");
        for (int i = 0; i < n; i++) {
            // imprimir o termo . Se for numero primo, adiciona um asterisco.
            if (ehPrimo(a)) {
                System.out.print(a + "* ");
            } else {
                System.out.print(a + " ");
            }
            long proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
        sc.close();
    }
    public static boolean ehPrimo(long numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (long j = 2; j * j <= numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }}