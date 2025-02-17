//Receba uma matriz 4x4 de numeros inteiros e calcule:
//1 - A soma de todos o elementos da matriz.
//2 - a soma de elementos de cada linha.
//3 - a soma dos elementos de cada coluna.

package com.agibank.semana3.matriz.matriz02;

public class matriz4x4 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int somaTotal = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                somaTotal += matriz[l][c];
            }
        }
        System.out.println("\nSoma de todos os elementos da matriz: " + somaTotal);
        System.out.println("\nSoma dos elementos de cada linha:");
        for (int l = 0; l < matriz.length; l++) {
        int somaLinha = 0;
            for (int c = 0; c < matriz[0].length; c++) {
                somaLinha += matriz[l][c];
            }
            System.out.println("Linha " + (l + 1) + ": " + somaLinha);
        }

        System.out.println("\nSoma dos elementos de cada coluna:");
        for (int c = 0; c < matriz[0].length; c++) {
            int somaColuna = 0;
            for (int l = 0; l < matriz.length; l++) {
                somaColuna += matriz[l][c];
            }
            System.out.println("Coluna " + (c + 1) + ": " + somaColuna);
        }
    }
}
