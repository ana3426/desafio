package desafio;

import java.util.Scanner;

public class exercicio_08 {
    public class ConversorBases {
        Scanner sc = new Scanner(System.in);
        // Função para converter decimal em binário manualmente
        public static String decimalParaBinario(int numero) {
            if (numero == 0) return "0";

            String binario = "";
            while (numero > 0) {
                int resto = numero % 2;      // obtém o resto da divisão por 2
                binario = resto + binario;   // adiciona o dígito à esquerda
                numero = numero / 2;         // divide o número por 2
            }
            return binario;
        }

        // Função para converter binário em decimal manualmente
        public static int binarioParaDecimal(String binario) {
            int decimal = 0;
            int potencia = 1; // representa 2^0, 2^1, 2^2...

            // percorre a string da direita para a esquerda
            for (int i = binario.length() - 1; i >= 0; i--) {
                char digito = binario.charAt(i);

                if (digito != '0' && digito != '1') {
                    System.out.println("Erro: número binário inválido!");
                    return -1;
                }

                // converte o caractere em inteiro (0 ou 1)
                int bit = digito - '0';
                decimal += bit * potencia; // soma bit * 2^posição
                potencia *= 2;             // aumenta a potência de 2
            }
            return decimal;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("===== CONVERSOR BINÁRIO ⇄ DECIMAL =====");
                System.out.println("1. Converter DECIMAL → BINÁRIO");
                System.out.println("2. Converter BINÁRIO → DECIMAL");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("\nDigite um número decimal: ");
                        int decimal = sc.nextInt();
                        if (decimal < 0) {
                            System.out.println("Erro: apenas números positivos são aceitos.\n");
                            break;
                        }
                        String bin = decimalParaBinario(decimal);
                        System.out.println("Representação binária: " + bin + "\n");
                        break;

                    case 2:
                        System.out.print("\nDigite um número binário: ");
                        String binario = sc.next();
                        int dec = binarioParaDecimal(binario);
                        if (dec != -1) {
                            System.out.println("Representação decimal: " + dec + "\n");
                        }
                        break;

                    case 0:
                        System.out.println("\nEncerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.\n");
                }

            } while (opcao != 0);
        }
    }

}