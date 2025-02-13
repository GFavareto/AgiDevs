//Crie um programa que receba os preços de fechamento de uma ação durante 10 dias e identifique:
//O maior preço atingido.
//O menor preço registrado.
//Entrada de exemplo: preços: {98.5, 102.0, 100.5, 101.0, 105.0, 107.5,110.0,108.5,106.0,109.5}
//Saida Esperada: Maior preço: 110.0

package com.agibank.semana3.vetores04;

public class maiormenor {
    public static void main(String[] args) {

        double[] precos = {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5};
        double maiorPreco = encontrarMaiorPreco(precos);
        double menorPreco = encontrarMenorPreco(precos);

        System.out.printf("Maior preço: %.1f%n", maiorPreco);
        System.out.printf("Menor preço: %.1f%n", menorPreco);
    }
    public static double encontrarMaiorPreco(double[] precos) {
        double maior = precos[0];
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > maior) {
                maior = precos[i];
            }
        }
        return maior;
    }
    public static double encontrarMenorPreco(double[] precos) {
        double menor = precos[0];
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] < menor) {
                menor = precos[i];
            }
        }
        return menor;
    }
}
