package desafio;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 1 e 399: ");
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            if (numero >= 1 && numero <= 399) {
                String romano = converterParaRomano(numero);
                System.out.println("O número " + numero + " em romano é: " + romano);
            } else {
                System.out.println("Erro: O número deve estar entre 1 e 399.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
        sc.close();
    }
    public static String converterParaRomano(int numero) {
        StringBuilder resultado = new StringBuilder();
        // usar os valores de 100 a 300
        while (numero >= 100) {
            if (numero >= 100 && numero < 300) {
                resultado.append("C");
                numero -= 100;
            } else if (numero >= 300) {
                resultado.append("CCC");
                numero -= 300;
            }
        }
        // usar a regra de subtração para 90 (XC)
        if (numero >= 90) {
            resultado.append("XC");
            numero -= 90;
        }
        // valores de 50 (L)
        if (numero >= 50) {
            resultado.append("L");
            numero -= 50;
        }
        // usar a regra de subtração para 40 (XL)
        if (numero >= 40) {
            resultado.append("XL");
            numero -= 40;
        }
        // valores de 10 a 30
        while (numero >= 10) {
            resultado.append("X");
            numero -= 10;
        }
        // usar a regra de subtração para 9 (IX)
        if (numero >= 9) {
            resultado.append("IX");
            numero -= 9;
        }
        // valor de 5 (V)
        if (numero >= 5) {
            resultado.append("V");
            numero -= 5;
        }
        // usar a regra de subtração para 4 (IV)
        if (numero >= 4) {
            resultado.append("IV");
            numero -= 4;
        }
        // valores de 1 a 3
        while (numero >= 1) {
            resultado.append("I");
            numero -= 1;
        }
        return resultado.toString();
    }
}

