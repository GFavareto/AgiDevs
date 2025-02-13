// crie um programa que recebe um valor com preços diarios de uma ação ao longo de 10 dias.
// O programa deve: Identificar se o mercado esta em uma tendencia de alta ( preços aumentam
// continuamente por pelo menos 3 dias consecutivos).
// Caso exista uma tendencia de alta, exibir os dias que compoem essa tendencia (indices do vetor).
// Caso contrario, exibir "Sem tendencia de alta identificada".

package com.agibank.semana3.vetores01;

public class precosdiarios {
    public static void main(String[] args) {

        double[] precos = {10, 2, 30, 4, 50, 60, 80, 9, 1, 130};
        int primeDia, ultiDia;

        for (int i = 0; i < precos.length-2;i++){
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]) {
                primeDia = i + 1;
                i = i + 2;
                while (precos[1] < precos[i + 1]) {
                    i++;
                    if (i == precos.length - 1) break;
                }
                ultiDia = i + 1;
                    System.out.printf("Têndencia entre os dias %d e %d \n", primeDia, ultiDia);
                    break;
            }
        }
    }
}