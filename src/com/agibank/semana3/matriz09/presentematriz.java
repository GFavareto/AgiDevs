//Dada uma matriz nxm de numeros reias, normalize os valores,
//dividindo cada elemento pelo maior valor presente na matriz.
//EXEMPLO DE ENTRADA: 2.0,4.0,6.0
//                    8.0,10.0,12.0
//
//EXEMPLO DE SAIDA: 0.17,0.33,0.50
//                  0.67,.83,1.00

package com.agibank.semana3.matriz09;

public class presentematriz {

    public static void main(String[] args) {

        double[][] matriz = {
                {2.0, 4.0, 6.0},
                {8.0, 10.0, 12.0}
        };
        double maiorValor = matriz[0][0];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[l][c] > maiorValor) {
                    maiorValor = matriz[l][c];
                }
            }
        }

        double[][] matrizNormalizada = new double[matriz.length][matriz[0].length];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matrizNormalizada[l][c] = matriz[l][c] / maiorValor;
            }
        }

        System.out.println("Matriz normalizada: ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.printf("\n%.2f", matrizNormalizada[l][c]);
            }
        }
    }
}

