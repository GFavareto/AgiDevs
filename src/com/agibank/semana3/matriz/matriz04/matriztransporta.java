//Dada uam matriz mxn, calcule e exiba a matriz transposta.
//Exemplo de entrada: 123
//                    456
//Exemplo de saida: 1 4
//                  2 5
//                  3 6

package com.agibank.semana3.matriz.matriz04;

public class matriztransporta {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
                        };
        int m = matriz.length;
        int n = matriz[0].length;
        int[][] transposta = new int[n][m];

        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                transposta[c][l] = matriz[l][c];
            }
        }
        System.out.println("Matriz transposta:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                System.out.print(transposta[l][c] + " ");
            }
            System.out.println();
        }
    }
}

