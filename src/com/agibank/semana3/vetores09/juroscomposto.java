//Crie um programa que armazene em um vetor os valores futuros de um investimento de
//R$ 1.000,00 aplicados em um juros compostos por 6 meses, com taxa de 2% ao mês. A formula utilizada é:
//Valor Futuro = Valor Inicial * (1+taxa)n
//Onde n é o numero de meses.
//Saída Esperada:
//Valores futuros: {1020.00,1040.40,1061.21,1082.43,1104.00,1126.16}

package com.agibank.semana3.vetores09;

public class juroscomposto {
    public static void main(String[] args) {

        double valorInicial = 1000.0;
        double taxa = 0.02;
        int meses = 6;
        double[] valoresFuturos = new double[meses];

        for (int i = 0; i < meses; i++) {
            valoresFuturos[i] = valorInicial * Math.pow(1 + taxa, i + 1);
        }
        System.out.print("Valores futuros: ");
        for (int i = 0; i < meses; i++) {
            System.out.printf("%.2f", valoresFuturos[i]);
            if (i < meses - 1) {
                System.out.print(", ");
            }
        }
    }
}
