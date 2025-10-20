package desafio;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas para a pirâmide: ");
        int numeroLinhas = sc.nextInt();
        // o laço de fora: controla as linhas da pirâmide (de 1 até o número digitado)
        for (int i = 1; i <= numeroLinhas; i++) {
            // o laço de dentro : controla a impressão de espaços para centralizar e organizar a pirâmide
            // A quantidade de espaços diminui a cada nova linha digitada
            for (int j = 1; j <= numeroLinhas - i; j++) {
                System.out.print(" ");
            }
            // o laço de dentro: controla a impressão dos números
            // Repete o número da linha atual (i) a quantidade de vezes que a linha indica
            for (int x = 1; x <= i; x++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
