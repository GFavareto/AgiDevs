// um usuario deseja converter reais(BRL) para dolares(USD), mas ha um limite diario
// de R$1000 para conversao. O programa deve perguntar o valor desejado, verificar se
// esta dentro do limite e calcular a conversao com uma taxa de cambio de 1 USD = 5 BRL.
// O programa termina quando o valor a ser convertido for negativo ou quando atingir o limite diario.

package com.agibank.semana2.s2esquenta04;
import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor;
        double convertido;
        final double taxaCambio = 5.0;
        final double limiteDiario = 1000.0;
        double totalConvertido = 0.0;

        System.out.println("Taxa de câmbio: 1 USD = 5 BRL");

        while (totalConvertido < limiteDiario) {
            System.out.print("Digite o valor a converter: ");
            valor = scanner.nextDouble();

            if (valor < 0) {
                break;
            }
            if (totalConvertido + valor > limiteDiario) {
                System.out.println("Erro: o limite diário de R$ 1000 foi ultrapassado! Encerrando conversões.");
                break;
            }
            convertido = valor / taxaCambio;
            totalConvertido += valor;

            System.out.printf("Você receberá: %.2f USD%n \nSeu limite de R$1000 diarios foi alcançado.", convertido);
        }
        scanner.close();
    }
}
