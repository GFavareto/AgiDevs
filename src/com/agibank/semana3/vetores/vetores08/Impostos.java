//Crie um programa que receba um vetor com os preços de compra e um vetor com
//os preços de venda de 5 ativos diferentes. O programa deve calcular o ganho
//ou perda de cada ativo e,se o lucro total ultrapassar R$20.000,00,calcular o
//imposto de 15% sobre o lucro excedente.
//Entrada de exemplo: Preços de compra: {10000.0,8000.0,12000.0,7000.0,15000.0}
//Preços de venda: {12000.0,8500.0,14000.0,7200.0,18000.0}
//Saida espera: Lucro Total:R$ 6.700,00
//Sem imposto devido.

package com.agibank.semana3.vetores.vetores08;

public class Impostos {
    public static void main(String[] args) {

        double[] compra = {10000.0, 8000.0, 12000.0, 7000.0, 15000.0};
        double[] venda = {12000.0, 8500.0, 14000.0, 7200.0, 18000.0};
        double lucroTotal = 0.0;
        double taxa = 0.15;

        for (int i = 0; i < compra.length; i++) {
            double lucro = venda[i] - compra[i];
            lucroTotal += lucro;
        }
        System.out.printf("Lucro Total: R$ %.2f%n", lucroTotal);
        if (lucroTotal > 20000.0) {
            double imposto = (lucroTotal - 20000.0) * taxa;
            System.out.printf("Imposto devido: R$ %.2f%n", imposto);
        } else {
            System.out.println("Sem imposto devido.");
        }
    }
}

