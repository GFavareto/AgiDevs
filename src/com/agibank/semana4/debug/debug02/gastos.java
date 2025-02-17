// Média dos Gastos Mensais: Um usuário acompanha seus gastos mensais em um vetor de 12 posições. Seu objetivo é calcular:
//        1. O gasto médio mensal.
//        2. Quantos meses tiveram gasto acima da média.
// Exemplo de Entrada:gastos mensais
// 1200 1350 1100 1250 1400 1300 1250 1400 1500 1600 1550 1650
// Saída Esperada:
// Média de gasto: 1400.00
// Meses acima da média: 5

package com.agibank.semana4.debug.debug02;

public class gastos {

    public static void main(String[] args) {
        double[] gastos = {1200, 1350, 1100, 1250, 1400, 1300, 1250, 1400, 1500, 1600, 1550, 1650};
        double soma = 0;
        int mesesAcimaMedia = 0;

        for (int i = 0; i < gastos.length; i++) {
            soma += gastos[i];
        }

        double media = soma / gastos.length;

        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > media) {
                mesesAcimaMedia++;
            }
        }

        System.out.printf("Média de gasto: %.2f\n", media);
        System.out.println("Meses acima da média: " + mesesAcimaMedia);
    }
}



