// Crie um método estatico chamdo converMoeda() que recebe um valor em reais (R$)
//e uma taxa de conversao para dolares (USD) e retorna o valor convertido.

//Entrada: Valor em reais 100.0
//Taxa de conversao 4.90

//Saida: 100.0 reais quivalem a 20.41 dolares.

package com.agibank.semana4.metodos.metodos01;

public class moeda {
    public static double converterMoeda(double valorReais, double taxaConversao) {
        return valorReais / taxaConversao;
    }

    public static void main(String[] args) {
        double valorReais = 100.0;
        double taxaConversao = 4.90;
        double valorConvertido = converterMoeda(valorReais, taxaConversao);
        System.out.printf("%.1f reais equivalem a %.2f dólares.%n", valorReais, valorConvertido);
    }
}
