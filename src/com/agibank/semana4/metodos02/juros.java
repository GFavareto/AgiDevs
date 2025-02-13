// Implemente um metodo chamado calcularJurosSimples() que receba o capital inicial,
// a taxa inicial, a taxa de juros anual (%) e o tempo (em anos). O metodo deve retornar
// o montante final apos o periodo.
//ENTRADA: Capital 1000.0, taxa 5.0%, Anos : 3
//SAIDA: Montante final: 1150.0
//SAida montante final 1150.0
package com.agibank.semana4.metodos02;

public class juros {

    public static double calcularJurosSimples(double capitalInicial, double taxaJurosAnual, int tempoEmAnos) {
        double juros = capitalInicial * (taxaJurosAnual / 100) * tempoEmAnos;
        return capitalInicial + juros;
    }

    public static void main(String[] args) {
        double capital = 1000.0;
        double taxa = 5.0;
        int anos = 3;
        double montanteFinal = calcularJurosSimples(capital, taxa, anos);
        System.out.printf("Montante final: %.2f%n", montanteFinal);
    }
}
