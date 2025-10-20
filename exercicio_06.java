package desafio;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10; // gera tabuada de 1 a 10
        System.out.printf("    "); // espaço para o cabeçalho da coluna de multiplicando
        for (int j = 1; j <= max; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.print("----");
        for (int j = 1; j <= max; j++) {
            System.out.print("----");
        }
        System.out.println();
        // corpo da tabela: multiplicando = i, multiplicador = j
        for (int i = 1; i <= max; i++) {           // laço externo: cada linha (multiplicando)
            System.out.printf("%2d |", i);         // imprime o multiplicando no começo da linha
            for (int j = 1; j <= max; j++) {      // laço interno: percorre os multiplicadores
                System.out.printf("%4d", i * j);  // produto alinhado em largura 4
            }
            System.out.println();
        }
    }
}

