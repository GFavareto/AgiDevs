//Crie um metodo chamado calcularCrescimento()
// que receba o preço de uma ação em dois dias
// consecutivos e calcular a variação percentual.
//ENTRADA: Preço no dia 1: 100.0 Preço no dia 2: 105.0
//SAIDA : Crescimento: 5.0%

package com.agibank.semana4.metodos.metodos03;

public class crescimento {
    public static void calcularCrescimento(double dia1, double dia2) {
        double crescimento = ((dia2 - dia1) / dia1) * 100;
        System.out.printf("Crescimento: %.1f%%%n", crescimento);
    }

    public static void main(String[] args) {
        double dia1 = 100.0;
        double dia2 = 105.0;
        calcularCrescimento(dia1, dia2);
    }
}
