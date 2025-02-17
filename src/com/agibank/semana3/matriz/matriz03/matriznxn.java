//Receba uma matriz quadrada nxn e exiba os elementos da diagonal principal.
//Exemplo de entrada: 123
//                    456
//                    789
//Exemplo de saida: Diagonal principal: 159

package com.agibank.semana3.matriz.matriz03;

public class matriznxn {

    public void exibirDiagonalPrincipal(int[][] matriz) {

        int n = matriz.length;

        StringBuilder diagonal = new StringBuilder();
        for (int i = 0; i < n; i++) {
            diagonal.append(matriz[i][i]);
        }
        System.out.println("Diagonal principal: " + diagonal.toString());
    }
    public static void main(String[] args) {

        matriznxn dp = new matriznxn();
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        dp.exibirDiagonalPrincipal(matriz);
    }
}


