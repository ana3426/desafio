package desafio;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MIN_NUMERO = 1;
        final int MAX_NUMERO = 100;
        Random random = new Random();
        // Gera o número secreto
        int numeroSecreto = random.nextInt(MAX_NUMERO) + MIN_NUMERO;
        // Variáveis do jogo
        int palpite = 0;
        int tentativas = 0;
        System.out.println("Tente adivinhar o número secreto entre " + MIN_NUMERO + " e " + MAX_NUMERO + ".");
        // Laço principal do jogo
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            // Verifica se a entrada é um número
            if (sc.hasNextInt()) {
                palpite = sc.nextInt();
                tentativas++;
                // Fornece as dicas
                if (palpite < numeroSecreto) {
                    System.out.println("É maior!");
                } else if (palpite > numeroSecreto) {
                    System.out.println("É menor!");
                } else {
                    System.out.println("\nParabéns! Você adivinhou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
                    // Lógica para comparar a eficiência com a busca binária
                    int limiteSuperior = MAX_NUMERO;
                    int limiteInferior = MIN_NUMERO;
                    int tentativasOtimas = 0;
                    // Calcula o número ótimo de tentativas usando logaritmo (base 2)
                    // Para um intervalo de 1 a 100, o ideal são 7 tentativas (2^6 = 64, 2^7 = 128)
                    tentativasOtimas = (int) (Math.log(MAX_NUMERO - MIN_NUMERO + 1) / Math.log(2)) + 1;
                    if (tentativas <= tentativasOtimas) {
                        System.out.println("Você foi muito eficiente! Sua abordagem se aproximou da lógica de busca binária.");
                    } else {
                        System.out.println("Você pode ser mais eficiente! Um algoritmo de busca binária adivinharia em cerca de " + tentativasOtimas + " tentativas.");
                    }
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                sc.next();
            }
        }

    }
}

