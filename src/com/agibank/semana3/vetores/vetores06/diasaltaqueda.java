//Crie um programa que receba um vetor com os preços diarios de
//uma ação durante 10 dias e identifique:
//Quantos dias tiveram alta(preços maior que o do dia anterior).
//Qauntos dias tiveram queda(preços menor que o do dia anterior).
//Entrdada de exemplo: Preços:[100.0,102.5,101.0,103.5,105.0,106.0,108.5,107.0,109,5,110.0]
//Saida esperada: Dias de alta: 7 Dias de queda: 2

package com.agibank.semana3.vetores.vetores06;

public class diasaltaqueda {
    public static void main(String[] args) {

        double[] precos = {100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5, 107.0, 109.5, 110.0};
        int diasDeAlta = 0;
        int diasDeQueda = 0;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                diasDeAlta++;
            } else if (precos[i] < precos[i - 1]) {
                diasDeQueda++;
            }
        }
        System.out.printf("Dias de alta: %d%n", diasDeAlta);
        System.out.printf("Dias de queda: %d%n", diasDeQueda);
    }
}

