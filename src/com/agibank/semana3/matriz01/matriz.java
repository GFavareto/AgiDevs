//Crie uma matriz 3x3 de numeros inteiros e preencha-a manualmente.
//Em seguida, imorima os elementos da matriz no formato de tabela.

package com.agibank.semana3.matriz01;

public class matriz {
    public static void main(String[] args) {

        int[][] matriz = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                                };
        System.out.println("Matriz 3x3:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.printf("%4d", matriz[l][c]);
            }
            System.out.println();
        }
    }
}

