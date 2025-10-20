package desafio;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro (até 7 dígitos): ");
        int numero = sc.nextInt();
        if (ehPalindromoNumero(numero)) {
            System.out.println(numero + " é um palíndromo.");
        } else {
            System.out.println(numero + " não é um palíndromo.");
        }
        sc.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        if (ehPalindromoString(palavra)) {
            System.out.println("\"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + palavra + "\" não é um palíndromo.");
        }
        sc.close();
    }
    public static boolean ehPalindromoNumero(int numero) {
        int original = numero;
        int reverso = 0;
        while (numero > 0) {
            int ultimoDigito = numero % 10; // Pega o último dígito
            reverso = reverso * 10 + ultimoDigito; // Adiciona o último dígito ao número invertido
            numero = numero / 10; // Remove o último dígito do número inicial
        }
        // Compare o número inicial com o número invertido
        return original == reverso;
    }
    public static boolean ehPalindromoString(String str) {
        String stringLimpa = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remova os caracteres especiais e os converta para minúsculas
        int tamanho = stringLimpa.length();
        // Compare o primeiro e o último caractere, depois o segundo e o penúltimo e assim por diante.
        for (int i = 0; i < tamanho / 2; i++) {
            // Se os caracteres em posições correspondentes não forem iguais, ele não é um palíndromo
            if (stringLimpa.charAt(i) != stringLimpa.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
