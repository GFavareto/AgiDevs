// Cálculo do Retorno Diário de uma Ação: Dado um vetor com os preços de uma ação nos últimos 5 dias, calcule o percentual de variação diária em relação ao dia anterior.
//        Fórmula: Variacao = ((Pi, - Pi-1)/ Pi-1) × 100
// Exemplo de Entrada:(Preço diário da ação)
//        100.0 102.0 101.0 103.0 105.0
// Saída Esperada:(variação percentual diária)
//        2.00 -0.98 1.98 1.94

package com.agibank.semana4.debug.debug01;

public class retorno {

    public static void main(String[] args) {
        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0};
        double[] variacoes = new double[precos.length - 1];

        for (int i = 1; i < precos.length; i++) {
            variacoes[i - 1] = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;
        }

        for (double variacao : variacoes) {
            System.out.printf("%.2f ", variacao);
        }
    }
}

