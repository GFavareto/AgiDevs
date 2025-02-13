//Receba uma matriz quadrada nxn e calcule a soma dos elementos da
//diagonal principal e da diagonal secundaria.
//EXEMPLO DE ENTRADA: Matriz: 1,2,3
//                            4,5,6
//                            7,8,9
//EXEMPLO DE SAIDA: Soma da diagonal principal: 15
//                  Soma da diagonal secundaria: 15

package com.agibank.semana3.matriz07;

public class somadiagonal {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaDiagonalSecundaria);
    }
}