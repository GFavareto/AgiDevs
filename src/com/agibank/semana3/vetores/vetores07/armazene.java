//Crie um programa que armazene em um vetor os valores de 5 ações
//diferentes na carteira de um investidor. Em seguida, o programa deve calcular e exibir:
//O total investido somando os valores.
//O percentual de cada ação na carteira.
//Entrada de Exemplo: Carteira: [5000.0,3000.0,7000.0,4000.0,6000.0]
//Saida esperada: Total investido: R$25.000,00
//Percentual de cada ação:{20.00%,12.00%,28.00%,16.00%,24.00%}


package com.agibank.semana3.vetores.vetores07;

//public class armazene {
//    public static void main(String[] args) {
//
//        double[] carteira = {8000.0, 5000.0, 9000.0, 1000.0, 6000.0};
//        double totalInvestido = calcularTotalInvestido(carteira);
//
//        System.out.printf("Total investido: R$%.2f%n", totalInvestido);
//        System.out.print("Percentual de cada ação: ");
//
//        for (int i = 0; i < carteira.length; i++) {
//            double percentual = (carteira[i] / totalInvestido) * 100;
//            System.out.printf("%.2f%%", percentual);
//            if (i < carteira.length - 1) {
//                System.out.print(", ");
//            }
//        }
//    }
//    public static double calcularTotalInvestido(double[] carteira) {
//        double total = 0.0;
//        for (double valor : carteira) {
//            total += valor;
//        }
//        return total;
//    }
//}


public class armazene {
    public static void main(String[] args) {

        double[] carteira = {8000.0, 5000.0, 9000.0, 1000.0, 6000.0};
        double soma = 0;

        for (int i = 0; i < carteira.length; i++) {
            soma = soma + carteira[i];
        }
        for (int i = 0; i < carteira.length; i++) {
            double percentual = (carteira[1]/soma)*100;
            System.out.printf("%.2f%%", percentual);
            System.out.print(", ");
        }
    }
}
