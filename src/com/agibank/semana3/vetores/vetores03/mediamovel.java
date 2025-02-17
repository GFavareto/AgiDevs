//Cálculo da média de um ativo. A média de um ativo financeiro é usada para suavizar flutuações
//de curto prazo e identificar tendencias. Crie um programa que:
//Receba os preços de um ativo nos sultimos 7 dias. Calcule a média movel simples dos ultimos 3 dias.
//Entrada de exemplo: Preços[100.0,102.0,101.0,103.0,105.0,106.0,108.0]
//Saida Esperada: Média movel dos ultimos 3 dias: 106.33

package com.agibank.semana3.vetores.vetores03;

public class mediamovel {
    public static void main(String[] args) {
        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0, 106.0, 108.0};

        double mediaMovel = calcularMediaMovel(precos);

        System.out.printf("Média movel dos últimos 3 dias: %.2f%n", mediaMovel);
    }
    public static double calcularMediaMovel(double[] precos) {
        int dias = 3;
        double soma = 0.0;

        for (int i = precos.length - dias; i < precos.length; i++) {
            soma += precos[i];
        }
        return soma / dias;
    }
}
