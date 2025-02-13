// Implemente um metodo chamado calcularJurosCompostos() que calcula o montante final
// de um investimento com juros compostos, dado o capital inicial, a taxa de juros mensal
// e o numero de meses.
//ENTRADA: Capital: 1000.0 TAXA: 0.02 MESES: 12
// SAIDA: Montante final: 1268.24

package com.agibank.semana4.metodos08;

public class jurosComposto {
    public static double calcularJurosCompostos(double capital, double taxa, int meses) {
        return capital * Math.pow(1 + taxa, meses);
    }

    public static void main(String[] args) {
        double capital = 1000.0;
        double taxa = 0.02;
        int meses = 12;

        double montante = calcularJurosCompostos(capital, taxa, meses);
        System.out.printf("Montante final: %.2f%n", montante);
    }
}
