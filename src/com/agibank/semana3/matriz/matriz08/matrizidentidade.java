//Verifique se uma matriz quadrada nxn é uma matriz identidade
//Definição: Uma matriz identidade possui 1 na diagonal principal e 0 em todos os outros elementos.
//EXEMPLO DE ENTRADA: 1,0,0
//                    0,1,0
//                    0,0,1
//EXEMPLO DE SAIDA: A matriz é uma identidade

package com.agibank.semana3.matriz.matriz08;

public class matrizidentidade {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int n = matriz.length;
        boolean matrizIdentidade = true;

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                if (l == c && matriz[l][c] != 1) {
                    matrizIdentidade = false;
                    break;
                }
                if (l != c && matriz[l][c] != 0) {
                    matrizIdentidade = false;
                    break;
                }
            }
            if (!matrizIdentidade) {
                break;
            }
        }

        if (matrizIdentidade) {
            System.out.println("A matriz é uma identidade");
        } else {
            System.out.println("A matriz não é uma identidade");
        }
    }
}

