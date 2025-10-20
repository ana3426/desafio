package desafio;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor a ser sacado (somente R$): ");
        int valorSaque = sc.nextInt();
        if (valorSaque <= 0 || valorSaque % 2 != 0) { // confira se o numero e valido :(numeros maior que zero são par)
            System.out.println("Valor inválido. Por favor digite um numero positivo e que seja par.");
        } else {
            System.out.println("Sacando R$" + valorSaque + ":");
            int cedulas100 = 0;
            int cedulas50 = 0;
            int cedulas20 = 0;
            int cedulas2 = 0;
            //Cédulas de R$100
            if (valorSaque >= 100){
                cedulas100 = valorSaque / 100;
                valorSaque %=100; // Resto da divisão
            }
            // Cédulas de R$50
            if (valorSaque >= 50) {
                cedulas50 = valorSaque / 50;
                valorSaque %= 50; // Resto da divisão
            }
            // Cédulas de R$20
            if (valorSaque >= 20) {
                cedulas20 = valorSaque / 20;
                valorSaque %= 20; // Resto da divisão
            }
            // Cédulas de R$2
            if (valorSaque >= 2) {
                cedulas2 = valorSaque / 2;
                valorSaque %= 2; // Resto da divisão
            }
            if (valorSaque > 0) {
                System.out.println("Não foi possível sacar o valor exato com as cédulas disponíveis. Sobraram R$" + valorSaque);
            } else {
                System.out.println("Cédulas de R$100: " +cedulas100);
                System.out.println("Cédulas de R$50: " + cedulas50);
                System.out.println("Cédulas de R$20: " + cedulas20);
                System.out.println("Cédulas de R$2: " + cedulas2);
            }
        }
    }
}
