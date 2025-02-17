//Implemente a multiplicação de duas matrizes A e B, sendo A de dimensões mxn e
//B de dimensões nxp. Verifique se a multiplicação é possivel antes de realizar o calculo.

package com.agibank.semana3.matriz.matriz05;

public class matrizab {

    public static int[][] multiMatriz(int[][] A, int[][] B) {

        int m = A.length;
        int n = B[0].length;
        int[][] multi = new int[m][n];

        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                multi[l][c] = 0;
                for (int i = 0; i < A[0].length; i++) {
                    multi[l][c] += A[l][i] * B[i][c];
                }
            }
        }
        return multi;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        try {
            int[][] multi = multiMatriz(A, B);

            System.out.println("Resultado da multiplicação de A e B:");
            imprimirMatriz(multi);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

