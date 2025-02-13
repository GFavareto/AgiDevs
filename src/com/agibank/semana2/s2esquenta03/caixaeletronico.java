// Simule um caixa eletronico onde o usuario pode sacar dinheiro. O saldo inicial da conta
// sera digitado pelo usuario e o usuario pode fazer saques até que o saldo acabe.
// Se o usuario tentar sacar mais do que tem, o programa exibe uma mensagem de erro.
// O programa acaba quando o valor saque for negativo ou quando a conta for zerada.


package com.agibank.semana2.s2esquenta03;
import java.util.Scanner;

public class caixaeletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saque;
        double saldo;

        System.out.print("Digite o Saldo Inicial: R$ ");
        saldo = scanner.nextDouble();

        while (saldo > 0) {

            System.out.print("Digite o valor do saque: ");
            saque = scanner.nextDouble();

            if (saque < 0) {
                System.out.println("ERRO: Saldo não pode ser negativo");

            }
            else {if (saque > saldo) {
                System.out.println("Erro: saldo insuficiente!");
            } else {
                saldo -= saque;
                if (saldo == 0) {
                    System.out.println("Saldo zerado! Conta vazia.");
                    break;
                } else {
                    System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                }
            }
            }
        }
        scanner.close();
    } // mt foda ficou clean demais!
}
