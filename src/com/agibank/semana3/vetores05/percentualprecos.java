//Crie um programa que receba um vetor com os preços diarios
//de uma ação durante 5 dias e calcule a variação diaria.
//Formula: variação=((valor atual - valor anterior)/valor anterior) x 100
//Entrada de exemplo: Preços: {100.0,101.5,99.0-,102.0,105.0}
//Saida esperada: Variações diarias: {1.50%,-2.46%,3.03%,2.94%}

package com.agibank.semana3.vetores05;

public class percentualprecos {
    public static void main(String[] args) {

        double[] precos = {100.0, 101.5, 99.0, 102.0, 105.0};
        double[] variacoes = new double[precos.length - 1];

        for (int i = 1; i < precos.length; i++) {
            variacoes[i - 1] = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;
        }
        System.out.print("Variações diárias: {");
        for (int i = 0; i < variacoes.length; i++) {
            System.out.printf("%.2f%%", variacoes[i]);
            if (i < variacoes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

