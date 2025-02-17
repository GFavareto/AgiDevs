//Crie um programa que receba um valor com os preços de fechamento de uma ação
//durante 10 dias e calcule o maior drawdown ocorrido nesse periodo.
//A formula para calcular o drawdown diario é:
//Drawdown = ((Preco Atual - Pico Maximo Anterior)/Pico Maximo Anterior)*100
//O maior drawdown é o menor valor encontrado ao longo do periodo.
//Entrada de exemplo:
//Preços: {100.0,105.0,102.0,110.0,108.0,107.0,95.0,97.0,99.0,103.0}
//Saida Esperada:
//Maior drawdown: -13.64%
//Obs.: A maior queda ocorreu do pico de 110.0 para 95.0

package com.agibank.semana3.vetores.vetores10;

public class drawdown {
    public static void main(String[] args) {

        double[] precos = {100.0, 105.0, 102.0, 110.0, 108.0, 107.0, 95.0, 97.0, 99.0, 103.0};
        double maximo = precos[0];
        double maiorDraw = 0.0;

        for (int i = 1; i < precos.length; i++) {
            double draw = ((precos[i] - maximo) / maximo) * 100;
            if (draw < maiorDraw) {
                maiorDraw = draw;
            }
            if (precos[i] > maximo) {
                maximo = precos[i];
            }
        }
        System.out.printf("Maior drawdown: %.2f%%%n", maiorDraw);
        System.out.println("A maior queda ocorreu do pico de " + maximo + " para " + precos[6]);
    }
}




