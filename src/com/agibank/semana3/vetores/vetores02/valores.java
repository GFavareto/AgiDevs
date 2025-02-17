//Receba os valores de ações de um ativo referente a 5 dias de negociação.
//Calcular o crescimento percentual acumulado em 5 dias. Considere:
//crescimento diario = ((valor atual - valor anterior)/valor anterior).

package com.agibank.semana3.vetores.vetores02;

public class valores {
    public static void main(String[] args) {
        double[] valores = {1, 2, 3, 4, 5};
        double crescAcumulo = 0.0;

        for (int i = 1; i < valores.length; i++) {
            double crescDiario = (valores[i] - valores[i - 1]) / valores[i - 1];
            crescAcumulo += crescDiario;
        }
        System.out.println("O crescimento percentual acumulado em 5 dias é: " + crescAcumulo + "%");
    }
}